package com.gcx.service;

import com.gcx.bean.Goods;
import com.gcx.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName GoodsService
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午4:27
 * @Version 1.0
 */
@Component
public class GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    /**
     * 事务用
     */
    @Transactional
    public  void insertGoods(){

        Goods goods = new Goods();
        goods.setGoodsNum(3);
        goods.setGoodsNm("就是个goods");
        goodsMapper.insertGoods(goods);
        System.out.println("===============插入成功=================");
        int a = 10/0;
    }

    public List<Goods> queryNum(int goodsId){


        return goodsMapper.query(goodsId);
    }

    @Transactional
    public int updateGoodsNum(int goodsId,int num){
        List<Goods> goods1 = queryNum(1);

        if (goods1.size()<num){
            return 0;
        }
        List<Goods> goods = queryNum(goodsId);
        if(goods.size() < num){
            return 0;
        }

        Goods good = new Goods();
        good.setGoodsId(goodsId);
        good.setGoodsNum(num);
        int i = goodsMapper.updateGoodsNum(good);
        if(i>0){

            System.out.println("成功");

        }else{

            System.out.println("失败");
        }

        return i;

    }
}
