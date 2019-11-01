package com.gcx.config;

import com.gcx.bean.spring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @ClassName MainConfig
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/28 下午1:58
 * @Version 1.0
 */
@Configuration
@ComponentScan({"com.gcx.extendsClass","com.gcx.bean.spring"})
public class MainConfig {

    @Bean(initMethod = "init")
//    @Bean
    public Dog dog(){
        return new Dog();
    }




}
