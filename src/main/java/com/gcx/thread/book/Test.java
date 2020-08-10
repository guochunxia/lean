package com.gcx.thread.book;


import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName Test
 * @Author guo_chx@suixingpay.com
 * @Date 2020/1/15 上午10:34
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(1);
        integer.incrementAndGet();

//        AtomicStampedReference
//        Throwable
//                Exception
    }
}
