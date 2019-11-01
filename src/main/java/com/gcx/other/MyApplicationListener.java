package com.gcx.other;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyApplicationListener
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/30 下午2:51
 * @Version 1.0
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        System.out.println("收到事件。。。"+event);

    }
}
