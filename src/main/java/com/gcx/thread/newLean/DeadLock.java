package com.gcx.thread.newLean;

/**
 * @ClassName DeadLock
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/20 下午5:10
 * @Version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        new Thread(){
            @Override
            public void run() {

                synchronized (stringBuffer1){

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stringBuffer1.append("a");
                    stringBuffer2.append("1");

                    synchronized (stringBuffer2){
                        stringBuffer1.append("b");
                        stringBuffer2.append("2");
                        System.out.println(stringBuffer1);
                        System.out.println(stringBuffer2);
                    }
                }

            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (stringBuffer2){
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stringBuffer1.append("c");
                    stringBuffer2.append("3");

                    synchronized (stringBuffer1){
                        stringBuffer1.append("d");
                        stringBuffer2.append("4");
                        System.out.println(stringBuffer1);
                        System.out.println(stringBuffer2);
                    }
                }

            }
        }).start();
    }
}
