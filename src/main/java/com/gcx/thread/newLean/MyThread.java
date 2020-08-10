package com.gcx.thread.newLean;

/**
 * @ClassName MyThread
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/19 下午2:12
 * @Version 1.0
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+":"+i);
                if(i == 20){
                    yield();
                }
            }
        }
    }
}
