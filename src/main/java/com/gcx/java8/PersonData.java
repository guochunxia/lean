package com.gcx.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PersonData
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/8 下午12:54
 * @Version 1.0
 */
public class PersonData {


    public static List<Person> getPersons(){

        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1,"张三");
        Person p2 = new Person(2,"李四");
        Person p3 = new Person(3,"王五");
        Person p4 = new Person(4,"小软");
        Person p5 = new Person(5,"郭春霞");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        return  list;

    }
}
