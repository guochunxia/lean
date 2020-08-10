package com.gcx.thread;

import org.springframework.transaction.support.TransactionTemplate;

public class TiketThread extends Thread{

    TransactionTemplate re;
    private static int i =0;
    private static int max =100;
    @Override
    public synchronized void run() {

//       synchronized (this){

           while(i<max){
               System.out.println(++i);
           }

//       }
    }

    public static void main(String[] args) throws InterruptedException {
        TiketThread t1= new TiketThread();
        TiketThread t2= new TiketThread();
        TiketThread t3= new TiketThread();
        Thread.sleep(100);
        t1.start();
        t2.start();
        t3.start();
    }
}
