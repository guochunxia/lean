package com.gcx.thread;

public class ObjectLock {
    private static int num = 0;
    private synchronized void test(){
        num++;
        System.out.printf("测试对象锁"+num);
    }

    public static void main(String[] args) {
        new Thread(()->{
            ObjectLock objectLock = new ObjectLock();
            objectLock.test();
        }).start();

        new Thread(()->{
            ObjectLock objectLock = new ObjectLock();
            objectLock.test();
        }).start();

    }
}
