package org.example.spring.test;

import org.example.AOP.annotation.Calculator;
import org.example.AOP.annotation.CalculatorImplement;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testByAOPAnnotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1,2);
    }
}
