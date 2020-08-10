package com.gcx.thread.newLean.ticket;

/**
 * @ClassName TicketRunnable
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午2:17
 * @Version 1.0
 */
public class TicketRunnable implements Runnable {

    private int ticket = 100;

    private Object o = new Object();

    @Override
    public void run() {


        while(true){
            synchronized (this){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"票号："+ticket);
                    ticket -- ;
                }else{
                    break;
                }
            }
        }

    }
}
