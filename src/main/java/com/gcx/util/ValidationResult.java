package com.gcx.util;

import java.util.Map;

/**
 * @ClassName ValidationResult
 * @Author guo_chx@suixingpay.com
 * @Date 2019/8/16 下午2:59
 * @Version 1.0
 */
public class ValidationResult {


    private boolean hasErrors;
    private Map<String, String> errorMsg;

    public ValidationResult() {
    }

    public boolean isHasErrors() {
        return this.hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(Map<String, String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String toString() {
        return "ValidationResult [hasErrors=" + this.hasErrors + ", errorMsg=" + this.errorMsg + "]";
    }
}
