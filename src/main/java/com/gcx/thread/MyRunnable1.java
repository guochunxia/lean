package com.gcx.thread;

/**
 * @ClassName MyRunnable1
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/15 下午4:12
 * @Version 1.0
 */
public class MyRunnable1 implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("myrunnable1======="+Thread.currentThread().getName());
    }
}
