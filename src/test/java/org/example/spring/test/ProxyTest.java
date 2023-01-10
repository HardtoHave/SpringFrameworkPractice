package org.example.spring.test;

import org.example.springProxy.CalculatorImplement;
import org.example.springProxy.CalculatorStaticProxy;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void testProxy(){
        CalculatorStaticProxy proxy=new CalculatorStaticProxy(new CalculatorImplement());
        int result = proxy.add(1, 2);
        System.out.println(result);
    }
}
