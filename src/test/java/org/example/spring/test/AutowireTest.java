package org.example.spring.test;

import org.example.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-autowire.xml ");
        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}
