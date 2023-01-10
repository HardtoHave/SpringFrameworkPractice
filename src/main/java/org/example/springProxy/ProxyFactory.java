package org.example.springProxy;

import java.lang.reflect.Proxy;

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
        return Proxy.newProxyInstance()
    }
}
