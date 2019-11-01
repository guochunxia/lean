package com.gcx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @ClassName Log
 * @Author guo_chx@suixingpay.com
 * @Date 2019/10/29 上午10:27
 * @Version 1.0
 */
@Aspect
public class Log {

    @Pointcut("execution(public * com.gcx.aop.Calculation.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
//    @Before("public int com.gcx.aop.Calculation.*(..))")
    public void logStart(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("方法执行前...方法名："+joinPoint.getSignature().getName()+"方法列表"+ Arrays.asList(args));

    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint){


        System.out.println("方法执行结束 ...");

    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result){

        System.out.println("方法返回result"+result);

    }

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("方法异常 异常信息exception"+exception);

    }
//    @Around(value = "pointCut()")
//    public Object around(){
//        System.out.println("around...");
//        return 1;
//
//    }
}
