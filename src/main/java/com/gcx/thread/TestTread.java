package com.gcx.thread;

import org.junit.Test;

/**
 * @ClassName TestTread
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/15 下午3:29
 * @Version 1.0
 */
public class TestTread {

    public static void main(String[] args) {
        System.out.println("a-----"+Thread.currentThread().getName());



        new Thread(()->{

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("b-------"+Thread.currentThread().getName());


        }).start();
    }


    @Test
    public void test1(){
        MyThread myThread = new MyThread();
        System.out.println("1===="+myThread.isAlive());
        myThread.start();
        System.out.println("2===="+myThread.isAlive());


    }

    @Test
    public void test2(){

        MyRunnable1 myRunnable1 = new MyRunnable1();


    }

    @Test
    public void test3(){

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

    }

    @Test
    public void test4() throws InterruptedException {

        System.out.println("=====1======="+Thread.currentThread().getName());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.join();
        System.out.println("=====2======"+Thread.currentThread().getName());



    }
}
