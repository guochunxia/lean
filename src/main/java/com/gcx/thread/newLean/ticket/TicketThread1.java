package com.gcx.thread.newLean.ticket;

/**
 * @ClassName TicketThread1
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午4:14
 * @Version 1.0
 */
public class TicketThread1  extends Thread{

    private static int ticket  = 100;
    private static Object o  = new Object();
    @Override
    public void run() {

        while(true){
            if(!show()){
                break;
            }
        }
    }

//    private synchronized boolean show(){
    private static synchronized boolean show(){//对于继承Thread类的多线程 此处必须为静态的，不然同步锁也不是同一个
        if(ticket>0){
            System.out.println(Thread.currentThread().getName()+"票号"+ticket);
            ticket --;
            return true;
        }else{
            return false;
        }

    }
}

class TestThread1{
    public static void main(String[] args) {

        TicketThread1 ticketThread1 = new TicketThread1();
        TicketThread1 ticketThread2 = new TicketThread1();
        TicketThread1 ticketThread3 = new TicketThread1();
        ticketThread1.setName("第1窗口");
        ticketThread2.setName("第2窗口");
        ticketThread3.setName("第3窗口");
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();

    }
}

