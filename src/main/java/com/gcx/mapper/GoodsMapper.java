package com.gcx.mapper;

import com.gcx.bean.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName GoodsMapper
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午4:27
 * @Version 1.0
 */
@Mapper
public interface GoodsMapper {

    List<Goods> query(int goodsId);

    int updateGoodsNum(Goods goods);


    void insertGoods(Goods goods);
}
