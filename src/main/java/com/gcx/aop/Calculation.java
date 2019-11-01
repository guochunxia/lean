package com.gcx.aop;

import org.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName Calculation
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/29 上午10:26
 * @Version 1.0
 */
@MapperScan
public class Calculation {

    public int div(int i,int j){
        System.out.println("执行div。。。");
        return i/j;
    }
}
