package org.example.AOP.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {
    public void  beforeAdviseMethod(JoinPoint joinPoint){
        //method name
        Signature signature = joinPoint.getSignature();
        //method param
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, method: "+signature.getName() +" , param: "+ Arrays.toString(args));
    }
    public void afterAdviceMethod(){
        System.out.println("LoggerAspect, after notification");
    }
    public void afterReturningMethod(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, return notification "+signature.getName()+" result: "+result);
    }
    public void afterThrowingAdviceMethod(Exception exception){
        System.out.println("LoggerAspect, exception notification: "+exception);
    }
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result=null;
        try {
            System.out.println("pre notification");
            result = joinPoint.proceed();
            System.out.println("return notification");
        }catch (Throwable throwable){
            throwable.printStackTrace();
            System.out.println("exception notification");
        }finally {
            System.out.println("back notification");
        }
        return result;
    }
}
