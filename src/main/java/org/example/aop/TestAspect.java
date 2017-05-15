package org.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class TestAspect {
    @Around("execution(* org.example.service.AopService.*(..))")
    public Object advice(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("TestAspect.advice()");
        return joinPoint.proceed();
    }
}
