package org.example.AOP.xml;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImplement implements Calculator {

    @Override
    public int add(int a, int b) {
        int result=a+b;
        System.out.println("inside method result: "+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result=a-b;
        System.out.println("inside method result: "+result);
        return result;
    }

    @Override
    public int multi(int a, int b) {
        int result=a*b;
        System.out.println("inside method result: "+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result=a/b;
        System.out.println("inside method result: "+result);
        return result;
    }
}
