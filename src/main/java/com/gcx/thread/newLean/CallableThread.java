package com.gcx.thread.newLean;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableThread
 * @Author guo_chx@suixingpay.com
 * @Date 2020/1/5 下午4:25
 * @Version 1.0
 */
public class CallableThread implements Callable<Integer>{
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        Integer num = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                num = num + i;
            }

        }
        return num;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableThread);

        new Thread(futureTask).start();

        Integer integer = futureTask.get();
        System.out.println(integer);
    }
}
