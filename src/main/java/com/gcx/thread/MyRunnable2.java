package com.gcx.thread;

/**
 * @ClassName MyRunnable2
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/15 下午4:21
 * @Version 1.0
 */
public class MyRunnable2 implements  Runnable {
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
        System.out.println("myrunnable2======"+Thread.currentThread().getName());
    }
}
