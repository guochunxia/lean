package com.gcx.generic;

/**
 * @ClassName Dao
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/13 上午10:23
 * @Version 1.0
 */
public class Dao<T> {

    private T t;

    //编译不通过
//    public static void testStatic(T t){
//
//    }

    public static <E> E testStatic2(E e){

        return e;

    }

    public T  test(T t){
        return t;
    }

}
