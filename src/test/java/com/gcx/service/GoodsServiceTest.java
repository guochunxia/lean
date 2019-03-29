package com.gcx.service;

import com.gcx.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * @ClassName GoodsServiceTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午4:50
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@MapperScan("com.gcx.*")
public class GoodsServiceTest {


    @Autowired
    GoodsService goodsService;
    CountDownLatch countDownLatch = new CountDownLatch(100);
    @Test
    public void queryNum() throws Exception {
    }

    @Test
    public void updateGoodsNum() {
          int buySucPerNum = 0;
          int buySucNum = 0;


        for (int i = 0; i < 100; i++) {
            int update = update(1, 3);
            if(update>0){
                buySucPerNum ++;
                buySucNum = buySucNum+3;
            }
            countDownLatch.countDown();
        }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("购买成功人数："+buySucPerNum);
            System.out.println("共购买数量："+buySucNum);


    }

    private int update(int goodsId,int num){

        try {

            countDownLatch.await();
        } catch (InterruptedException e) {


        }

        return goodsService.updateGoodsNum(1,3);

    }

    @Test
    public void insertGoods(){

        goodsService.insertGoods();

    }


}
