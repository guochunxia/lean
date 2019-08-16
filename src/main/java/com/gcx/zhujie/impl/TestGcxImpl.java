package com.gcx.zhujie.impl;

import com.gcx.zhujie.TestGcx;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @ClassName TestGcxImpl
 * @Author guo_chx@suixingpay.com
 * @Date 2019/8/16 上午11:41
 * @Version 1.0
 */
public class TestGcxImpl implements ConstraintValidator<TestGcx, Object> {
    @Override
    public void initialize(TestGcx constraintAnnotation) {

    }
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        if(StringUtils.isEmpty(value)){
            System.out.println(context.getDefaultConstraintMessageTemplate());
            return false;
        }
        return true;
    }
}

