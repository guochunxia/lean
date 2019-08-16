package com.gcx.controller;

import com.gcx.bean.TestValidatePo;
import com.gcx.util.ValidationResult;
import com.gcx.util.ValidationUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName TestValidateController
 * @Author guo_chx@suixingpay.com
 * @Date 2019/8/16 下午2:37
 * @Version 1.0
 */
@RestController
@RequestMapping("test")
public class TestValidateController {

    @RequestMapping("validate")
    public String testVlidate(@Validated TestValidatePo test,BindingResult result){

        //两种获取错误信息的方法

       // 法一：用@Validated开启 BindingResult result 获取结果
        result.getAllErrors().stream().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));

        //法二：自己获取错误信息
        ValidationResult validationResult = ValidationUtils.validateEntity(test);
        Map<String, String> errorMsg = validationResult.getErrorMsg();
        return null;
    }
}
