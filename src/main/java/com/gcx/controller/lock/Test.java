package com.gcx.controller.lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName Test
 * @Author guo_chx@suixingpay.com
 * @Date 2019/9/25 上午11:14
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args){
        L l = new L();
        l.hashCode();
        System.out.println("start");
        System.out.println(ClassLayout.parseInstance(l).toPrintable());
        synchronized (l){
            System.out.println("lock in");
        }
        System.out.println("end");
    }
}
