package com.gcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName Application
 * @Author guo_chx@suixingpay.com
 * @Date 2019/3/26 下午3:48
 * @Version 1.0
 */
@MapperScan("com.gcx.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
