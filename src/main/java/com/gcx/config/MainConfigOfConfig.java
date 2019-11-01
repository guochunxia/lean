package com.gcx.config;

import com.gcx.aop.Calculation;
import com.gcx.aop.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName MainConfigOfConfig
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/29 上午10:25
 * @Version 1.0
 */

/**
 * @EnableAspectJAutoProxy
 * 注册AnnotationAwareAspectJAutoProxyCreator -》implements SmartInstantiationAwareBeanPostProcessor, BeanFactoryAware
 */


@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfConfig {

    @Bean
    public Calculation calculation(){

        return new Calculation();

    }

    @Bean
    public Log log(){
        return new Log();
    }
}
