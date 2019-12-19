package com.gcx.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Person
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/13 下午5:13
 * @Version 1.0
 */
@Data
@ToString
@MyAnotation("123231")
public class Person extends Creator<String> implements Comparable<String>,MyInterface{

    private String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String showPublic(String show){
        return show;

    }

    @MyAnotation
    private String showPrivate(String show) throws NullPointerException{
        return show;

    }

    @Override
    public void interfaceMethod() {

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
