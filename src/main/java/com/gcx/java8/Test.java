package com.gcx.java8;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/7 下午8:29
 * @Version 1.0
 */
public class Test {

    @org.junit.Test
    public void test1(){
        List<Person> list = PersonData.getPersons();
        list.stream().filter(p->p.getId()>2).forEach(System.out :: print);
    }

    @org.junit.Test
    public void test2(){

        List<Person> list = PersonData.getPersons();
        list.stream().map(Person ::getName).forEach(System.out :: print);
        Optional<Person> first = list.stream().findFirst();
        System.out.println();
        System.out.println(first.get());

    }

    @org.junit.Test
    public void test3(){
        List<Person> list = PersonData.getPersons();
        Stream<Person> limit = list.stream().limit(2);
        Optional<Integer> reduce = limit.map(Person::getId).reduce((n1, n2) -> n1 + n2);
        System.out.println(reduce.get());
        //        Integer reduce = limit.map(Person::getId).reduce(1, (n1, n2) -> n1 + n2);
//        System.out.println(reduce);

    }

    @org.junit.Test
    public void test4(){
        List<Person> list = PersonData.getPersons();
        list.stream().sorted((n1, n2) ->
             n2.getId().compareTo(n1.getId())).forEach(System.out :: print);
    }

    @org.junit.Test
    public void test5(){
        List<Person> list = PersonData.getPersons();
        boolean b = list.stream().allMatch(n -> n.getId() > 0);
        System.out.println(b);
    }
}
