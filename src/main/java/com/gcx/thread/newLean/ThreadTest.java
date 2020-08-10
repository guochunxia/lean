package com.gcx.thread.newLean;

import org.junit.Test;

/**
 * @ClassName ThreadTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/19 下午2:11
 * @Version 1.0
 */
public class ThreadTest {

    @Test
    public void test1() throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("myThread1");
        myThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("开始执行myThread："+Thread.currentThread().getName());
        myThread.start();

//        MyThread myThread1 = new MyThread();
//
//        System.out.println("开始执行myThread1："+Thread.currentThread().getName());
//        myThread1.start();

        System.out.println("继续执行："+Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {


            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
//            if(i==20){
//                myThread.join();
//            }
        }


    }

    /**
     * 用匿名子类
     */
    @Test
    public void test2(){

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i%2 == 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

    }
}
