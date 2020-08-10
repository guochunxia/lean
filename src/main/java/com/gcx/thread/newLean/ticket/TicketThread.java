package com.gcx.thread.newLean.ticket;

/**
 * @ClassName TicketThread
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午4:01
 * @Version 1.0
 */
public class TicketThread  extends Thread{

    private static int ticket  = 100;
    private static Object o  = new Object();
    @Override
    public void run() {

        while(true){
            //        synchronized (o){//正确的
//            synchronized (this){//错误的 这里同步锁不能用this 因为每个线程都会new一个对象
            synchronized (this.getClass()){//正确的

                    if(ticket>0){
//                        try {
//                            sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        System.out.println(Thread.currentThread().getName()+"票号"+ticket);
                        ticket --;
                    }else{
                        break;
                    }
            }
        }
    }
}

class TestThread{
    public static void main(String[] args) {

        TicketThread ticketThread1 = new TicketThread();
        TicketThread ticketThread2 = new TicketThread();
        TicketThread ticketThread3 = new TicketThread();
        ticketThread1.setName("第1窗口");
        ticketThread2.setName("第2窗口");
        ticketThread3.setName("第3窗口");
        ticketThread1.start();
        ticketThread2.start();
        ticketThread3.start();

    }
}
