package org.example.spring.test;

import org.example.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest {
    @Test
    public void test(){
        //obtain IOC container
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentOne = (Student) ioc.getBean("studentOne");
        System.out.println(studentOne);
    }
}
