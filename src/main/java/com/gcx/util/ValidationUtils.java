package com.gcx.util;



import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName ValidationUtils
 * @Author guo_chx@suixingpay.com
 * @Date 2019/8/16 下午2:57
 * @Version 1.0
 */
public class ValidationUtils {

    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public ValidationUtils() {
    }

    public static <T> ValidationResult validateEntity(T obj) {
        ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<T>> set = validator.validate(obj, new Class[]{Default.class});
        if(CollectionUtils.isNotEmpty(set)) {
            result.setHasErrors(true);
            Map<String, String> errorMsg = new HashMap();
            Iterator var4 = set.iterator();

            while(var4.hasNext()) {
                ConstraintViolation<T> cv = (ConstraintViolation)var4.next();
                errorMsg.put(cv.getPropertyPath().toString(), cv.getMessage());
            }

            result.setErrorMsg(errorMsg);
        }

        return result;
    }

    public static <T> ValidationResult validateProperty(T obj, String propertyName) {
        ValidationResult result = new ValidationResult();
        Set<ConstraintViolation<T>> set = validator.validateProperty(obj, propertyName, new Class[]{Default.class});
        if(CollectionUtils.isNotEmpty(set)) {
            result.setHasErrors(true);
            Map<String, String> errorMsg = new HashMap();
            Iterator var5 = set.iterator();

            while(var5.hasNext()) {
                ConstraintViolation<T> cv = (ConstraintViolation)var5.next();
                errorMsg.put(propertyName, cv.getMessage());
            }

            result.setErrorMsg(errorMsg);
        }

        return result;
    }

}
