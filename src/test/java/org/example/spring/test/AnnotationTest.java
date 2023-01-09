package org.example.spring.test;

import org.example.spring.controller.UserController;
import org.example.spring.dao.UserDAO;
import org.example.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController bean = ioc.getBean("controller",UserController.class);

        System.out.println(bean);
        UserService bean1 = ioc.getBean("userServiceImplement",UserService.class);
        System.out.println(bean1);
        UserDAO bean2 = ioc.getBean("userDAOImplement",UserDAO.class);
        System.out.println(bean2);
        bean.saveUser();
    }
}
