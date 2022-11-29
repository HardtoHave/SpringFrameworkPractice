package org.example.spring.test;

import org.example.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    @Test
    public void testScope(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        Student bean = ioc.getBean(Student.class);
        Student student=ioc.getBean(Student.class);
        System.out.println(bean==student );
    }
}
