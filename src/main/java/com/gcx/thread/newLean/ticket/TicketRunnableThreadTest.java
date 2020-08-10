package com.gcx.thread.newLean.ticket;

import org.junit.Test;

/**
 * @ClassName TicketRunnableThreadTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午2:27
 * @Version 1.0
 */
public class TicketRunnableThreadTest {


    public static void main(String[] args) {

        TicketRunnable ticketRunnable = new TicketRunnable();

        Thread windon1 = new Thread(ticketRunnable);
        Thread windon2 = new Thread(ticketRunnable);
        Thread windon3 = new Thread(ticketRunnable);

        windon1.setName("窗口1");
        windon2.setName("窗口2");
        windon3.setName("窗口3");

        windon1.start();
        windon2.start();
        windon3.start();

    }
}
