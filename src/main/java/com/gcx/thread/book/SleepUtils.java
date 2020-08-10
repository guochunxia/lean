package com.gcx.thread.book;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SleepUtils
 * @Author guo_chx@suixingpay.com
 * @Date 2020/1/2 下午3:54
 * @Version 1.0
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}
