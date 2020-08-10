package com.gcx.bean;

import com.gcx.zhujie.TestGcx;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
 * @ClassName TestValidatePo
 * @Author guo_chx@suixingpay.com
 * @Date 2019/8/16 下午2:31
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class TestValidatePo {

    @TestGcx(message = "不能为空")
    @Length(min = 1,max = 5,message = "长度太长")
    private String name;
    private String age;


}
