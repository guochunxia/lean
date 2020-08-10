package com.gcx.controller;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName GoodsController
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午4:27
 * @Version 1.0
 */
@Component
public class GoodsController {

    public static void main(String[] args) {
        Date date = new Date();
        String date1 = new SimpleDateFormat("yyyyMMdd").format(date).toString();
        String time = new SimpleDateFormat("HHmmss").format(date).toString();
        System.out.println(date.toString());
        System.out.println(date1);

        System.out.println(time);



    }
}
