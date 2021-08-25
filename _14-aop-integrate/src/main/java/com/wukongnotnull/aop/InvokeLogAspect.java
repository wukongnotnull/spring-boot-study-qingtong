package com.wukongnotnull.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//author: 悟空非空也（B站/知乎/公众号）
@Aspect
@Component
public class InvokeLogAspect {

    public static final Logger logger = LoggerFactory.getLogger(InvokeLogAspect.class);

    // 指定哪些连接点为切点
    @Pointcut("@annotation(com.wukongnotnull.annotation.InvokeLog)")
    public void pc(){

    }
    // 在切点的位置切入什么方法增强呢
    @Around("pc()")
    public Object printInvokeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        //目标方法调用前
        Object proceed = null;
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        logger.info(methodName+"即将被调用");

        try {
            proceed = joinPoint.proceed();
            //目标方法调用后
            logger.info(methodName+"已经被调用");
        } catch (Exception e) {
             e.printStackTrace();
        }
        return proceed;
    }

}
