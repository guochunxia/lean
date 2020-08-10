package com.gcx.thread.newLean;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName LockTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午6:05
 * @Version 1.0
 */
public class LockTest {

    public static void main(String[] args) {

        Windon windon = new Windon();
        Thread thread1 = new Thread(windon);
        Thread thread2 = new Thread(windon);
        Thread thread3 = new Thread(windon);
        thread1.setName("1窗口");
        thread2.setName("2窗口");
        thread3.setName("3窗口");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Windon implements Runnable{

    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while(true){
            try{
                lock.lock();
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"票号"+ticket);
                    ticket --;
                }else{
                    break;
                }

            }finally {
                lock.unlock();
            }


        }

    }
}
