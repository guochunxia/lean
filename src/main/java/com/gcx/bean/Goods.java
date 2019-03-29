package com.gcx.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Goods
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午4:25
 * @Version 1.0
 */
@Data
@ToString
public class Goods {

    private Integer goodsId;
    private String goodsNm;
    private Integer goodsNum;
}
