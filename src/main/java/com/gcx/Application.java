package com.gcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
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

    /****
     * 1. bean 到底是什么 ---> spring 提供的对象 ---> BeanDefinition RootBeanDefinition
     * 2. spring 怎么将指定路径下的文件初始化bean的
     * 3. bean 是怎么初始化的
     * 4. bean 为什么是单例的
     * 5. beanfactorypostprocesser 干什么的
     * 6. beanpostprocessor 干甚的
     * 7. IOC 是什么
     * @param args
     */

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }
}
