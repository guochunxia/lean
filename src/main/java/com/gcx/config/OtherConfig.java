package com.gcx.config;

import com.gcx.other.Row;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName OtherConfig
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/30 上午11:33
 * @Version 1.0
 */

@Configuration
@ComponentScan("com.gcx.other")
public class OtherConfig {

    @Bean
    public Row row(){
        return new Row();

    }
}
