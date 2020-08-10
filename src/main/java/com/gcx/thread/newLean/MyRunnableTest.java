package com.gcx.thread.newLean;

import org.junit.Test;

/**
 * @ClassName MyRunnableTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 上午11:28
 * @Version 1.0
 */
public class MyRunnableTest {

    @Test
    public void test1(){

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread1.start();
        thread2.start();

    }
}
