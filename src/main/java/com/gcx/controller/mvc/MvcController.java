package com.gcx.controller.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MvcController
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/24 下午2:20
 * @Version 1.0
 */
@RestController
public class MvcController {

    @RequestMapping("test")
    public String testMvc(){

        return "fadsfa";

    }
}
