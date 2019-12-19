package com.gcx.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Person
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/8 下午12:49
 * @Version 1.0
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String name;
}
