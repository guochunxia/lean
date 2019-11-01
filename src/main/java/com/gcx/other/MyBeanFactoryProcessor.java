package com.gcx.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName MyBeanFactoryProcessor
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/30 上午11:34
 * @Version 1.0
 */

@Component
public class MyBeanFactoryProcessor  implements BeanFactoryPostProcessor{
    /**
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException in case of errors
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("执行MyBeanFactoryProcessor。。。postProcessBeanFactory");
        int beanPostProcessorCount = beanFactory.getBeanPostProcessorCount();
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("beanPostProcessorCount.."+beanPostProcessorCount);
        System.out.println("beanDefinitionNames.."+ Arrays.asList(beanDefinitionNames));

    }
}
