package com.gcx.dataStructure;

import com.alibaba.druid.support.json.JSONUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/2 下午3:12
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        List list = new ArrayList(1000);
        List list1 = new ArrayList();
        String a[] = {"a","b"};
        List list2 = new ArrayList(Arrays.asList(a));
        System.out.println(JSONUtils.toJSONString(list2));
        List linkList = new LinkedList(Arrays.asList(a));


    }

}
