package com.gcx.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/13 上午11:32
 * @Version 1.0
 */
public class GenericTest{

    public static void main(String[] args) {
        List<Person> list1;
        List<Man> list2;
//        list1 = list2;//编译不通过


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (Object o :list) {
            System.out.println(o);
        }

        List<?> listNew = new ArrayList<>();
        listNew = list;
//        listNew.add("123");//编译报错
        listNew.add(null);

        List<? extends Person> list3 = new ArrayList<>();
//        list3.add(new Man());

    }
}
