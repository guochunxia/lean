package com.gcx.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/19 上午11:00
 * @Version 1.0
 */
//资源类
class MyList {

    //临界资源
    private volatile List<String> list = new ArrayList<String>();

    public void add() {
        list.add("abc");
    }

    public int size() {
        return list.size();
    }
}

// 线程A
class ThreadA extends Thread {

    private MyList list;

    public ThreadA(MyList list,String name) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//线程B
class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list,String name) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {          // while 语句轮询
                if (list.size() == 2) {
                    System.out.println("==2了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//测试
class Test {
    public static void main(String[] args) {

        MyList service = new MyList();

        ThreadA a = new ThreadA(service,"A");
        ThreadB b = new ThreadB(service,"B");

        a.start();
        b.start();
    }
}
/* Output(输出结果不唯一):
   添加了1个元素
   添加了2个元素
   ==2了，线程b要退出了！
   java.lang.InterruptedException at test.ThreadB.run(Test.java:57)
   添加了3个元素
 */
