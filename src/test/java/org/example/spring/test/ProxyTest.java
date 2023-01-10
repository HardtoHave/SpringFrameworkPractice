package org.example.spring.test;

import org.example.springProxy.Calculator;
import org.example.springProxy.CalculatorImplement;
import org.example.springProxy.CalculatorStaticProxy;
import org.example.springProxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void testProxy(){
        CalculatorStaticProxy proxy=new CalculatorStaticProxy(new CalculatorImplement());
        int result = proxy.add(1, 2);
        System.out.println(result);
    }

    /**
     * dynamic proxy:
     * 1. jdk proxy
     * 2. cglib proxy
     */
    @Test
    public void testDynamicProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImplement());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
