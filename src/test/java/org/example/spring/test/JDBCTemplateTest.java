package org.example.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//run under spring environment, obtain bean in IOC through injection
@RunWith(SpringJUnit4ClassRunner.class)
//setup spring test environment configuration
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testInsert(){
        String sql="insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"li","987654321",23,"female","li@gmail.com");
    }
    @Test
    public void testGetUserById(){

    }
}
