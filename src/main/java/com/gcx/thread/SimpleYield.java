package com.gcx.thread;

/**
 * @ClassName SimpleYield
 * @Author guo_chx@suixingpay.com
 * @Date 2019/11/18 下午3:55
 * @Version 1.0
 */
public class SimpleYield extends Thread{

    public SimpleYield(String thredName) {
        this.thredName = thredName;
    }

    private String thredName;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("=====this.name==="+thredName+"====i==="+i);
            if(i==5){
                Thread.yield();
            }

        }
    }

    public static void main(String[] args) {
        SimpleYield simpleYield1 = new SimpleYield("小花");
        SimpleYield simpleYield2 = new SimpleYield("小草");
        simpleYield1.start();
        simpleYield2.start();
    }
}
