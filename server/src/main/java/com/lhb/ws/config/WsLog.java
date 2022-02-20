package com.lhb.ws.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lhb
 * @date 2022/2/20 16:04
 */
@Aspect
@Component
public class WsLog {
    @Pointcut("execution(* com.lhb.ws.service.impl.*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String arg = args[0].toString();
        System.out.println(arg+"\nXML信息保存到日志中");
    }
}
