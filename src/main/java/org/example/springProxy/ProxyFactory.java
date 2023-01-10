package org.example.springProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        /**
         * Classloader
         * Class[] interfaces
         * InvocationHandler
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = (proxy, method, args) -> {
            System.out.println("log, method: "+method.getName()+", param: "+ Arrays.toString(args));
            Object result = method.invoke(target, args);
            System.out.println("log, method: "+method.getName()+", result: "+ result);
            return result;
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
