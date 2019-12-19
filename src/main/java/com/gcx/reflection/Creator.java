package com.gcx.reflection;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Creator
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/18 上午10:42
 * @Version 1.0
 */
@NoArgsConstructor
@Data
public class Creator <T> {

    private char gender;
    public Integer weight;

    private void eat(){

        System.out.println("生物吃");

    }

    public void sleep(){
        System.out.println("睡呀睡");
    }
}
