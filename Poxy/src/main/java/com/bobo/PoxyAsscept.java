package com.bobo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/2.
 */
@Aspect
@Component
public class PoxyAsscept {


    @Pointcut("execution(* com.bobo..*.*(..))")
    public void getPoint(){
        System.out.println("AOP");
    }


//    @Around("getPoint()")
//    public Object aroud(JoinPoint joinPoint) throws Throwable {
//        System.out.println("通知切入");
//        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)joinPoint;
//        return proceedingJoinPoint.proceed();
//    }

    @After("getPoint()")
    public void after(JoinPoint joinPoint)throws Throwable{
        System.out.println("执行之后  ----- after");
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)joinPoint;
       // return proceedingJoinPoint.proceed();
    }

    @After("getPoint()")
    public Object befor(JoinPoint joinPoint) throws Throwable {
        System.out.println("执行之前  ----- befor");
        ProceedingJoinPoint proceedingJoinPoint = (ProceedingJoinPoint)joinPoint;
        return proceedingJoinPoint.proceed();
    }
}
