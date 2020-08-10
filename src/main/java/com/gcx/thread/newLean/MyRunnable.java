package com.gcx.thread.newLean;

/**
 * @ClassName MyRunnable
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 上午11:11
 * @Version 1.0
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }

    }
}
