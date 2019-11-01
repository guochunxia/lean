package com.gcx.config;

import com.gcx.aop.Calculation;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.EventObject;

import static org.junit.Assert.*;

/**
 * @ClassName MainConfigTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/28 下午2:00
 * @Version 1.0
 */
public class MainConfigTest {


    @Test
    public void test01(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames){
            System.out.println("beanNams-----:"+name);
        }

    }

    @Test
    public void test02(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfConfig.class);

//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames){
//            System.out.println("beanNams-----:"+name);
//        }
        Calculation bean = applicationContext.getBean(Calculation.class);
        int div = bean.div(2, 1);

    }


    @Test
    public void test03(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(OtherConfig.class);


        applicationContext.publishEvent(new ApplicationEvent(new String("我是一个String")) {
        });


    }

}