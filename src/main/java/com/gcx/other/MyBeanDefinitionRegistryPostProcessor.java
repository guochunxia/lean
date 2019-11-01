package com.gcx.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName BeanDefinitionRegistryPostProcessor
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/30 下午2:32
 * @Version 1.0
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        System.out.println("postProcessBeanDefinitionRegistry数量。。。"+registry.getBeanDefinitionCount());
//        System.out.println("postProcessBeanDefinitionRegistry数量。。。"+registry.getBeanDefinitionCount());
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Row.class);
        registry.registerBeanDefinition("row",beanDefinition);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory数量"+beanFactory.getBeanDefinitionCount());

    }
}
