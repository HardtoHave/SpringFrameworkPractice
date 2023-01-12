package org.example.AOP.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {
    @Before("org.example.AOP.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("validate aspect: pre notification");
    }
}
