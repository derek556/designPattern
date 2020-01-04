package com.proxy.dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = null;
        try {
            if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
                throw new IllegalAccessException("cglib拦截方法");
            }else {
                invoke = methodProxy.invokeSuper(o, objects);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return invoke;
    }
}
