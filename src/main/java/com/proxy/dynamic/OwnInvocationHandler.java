package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnInvocationHandler implements InvocationHandler {

    PersionBean persionBean;

    public OwnInvocationHandler(PersionBean persionBean) {
        this.persionBean = persionBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
                throw new IllegalAccessException("不可调用的方法");
            }else {
                method.invoke(persionBean,args);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
