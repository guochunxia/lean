package com.gcx.other;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyLisService
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/30 下午4:03
 * @Version 1.0
 */
@Component
public class MyLisService {

    @EventListener(classes={ApplicationEvent.class})
    public void listener(ApplicationEvent event){

        System.out.println("MyLisService... 收到的事件："+event);

    }
}
