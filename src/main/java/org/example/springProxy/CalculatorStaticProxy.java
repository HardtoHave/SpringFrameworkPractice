package org.example.springProxy;

public class CalculatorStaticProxy implements Calculator{
    private CalculatorImplement calculatorImplement;

    public CalculatorStaticProxy(CalculatorImplement calculatorImplement) {
        this.calculatorImplement = calculatorImplement;
    }


    @Override
    public int add(int a, int b) {
        System.out.println("log, method:add, param: "+a+","+b);
        int result = calculatorImplement.add(a, b);
        System.out.println("log, method:add, result: "+result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("log, method:sub, param: "+a+","+b);
        int result = calculatorImplement.sub(a, b);
        System.out.println("log, method:sub, result: "+result);
        return result;
    }

    @Override
    public int multi(int a, int b) {
        System.out.println("log, method:multiply, param: "+a+","+b);
        int result = calculatorImplement.add(a, b);
        System.out.println("log, method:multiply, result: "+result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("log, method:divided, param: "+a+","+b);
        int result = calculatorImplement.add(a, b);
        System.out.println("log, method:divided, result: "+result);
        return result;
    }
}
