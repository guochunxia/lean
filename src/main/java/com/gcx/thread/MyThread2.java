package com.gcx.thread;

/**
 * @ClassName MyThread2
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/15 下午4:57
 * @Version 1.0
 */
public class MyThread2 extends Thread{
    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
        System.out.println("2==========="+Thread.currentThread().getName());
    }
}
