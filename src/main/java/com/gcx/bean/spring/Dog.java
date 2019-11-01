package com.gcx.bean.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Dog
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/28 下午1:58
 * @Version 1.0
 */
public class Dog implements  ApplicationContextAware{

    ApplicationContext context;

    public Dog() {
        System.out.println("Dog...");
    }

    /**
     *  @bean 注解指定初始化
     */
    public void init(){

        System.out.println("初始化Dog...");
    }

    /**
     *  @PostConstruct 指定初始化方法
     */
//    @PostConstruct
    public void initPostStruct(){
        System.out.println("Dog PostConstruct....");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
        System.out.println("");

    }
}
