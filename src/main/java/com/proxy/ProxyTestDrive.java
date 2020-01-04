package com.proxy;

import com.proxy.dynamic.OwnInvocationHandler;
import com.proxy.dynamic.PersionBean;
import com.proxy.dynamic.PersionBeanImpl;

import java.lang.reflect.Proxy;

public class ProxyTestDrive {

    public PersionBean getOwnPersionProxy(PersionBean persionBean) {
        return (PersionBean) Proxy.newProxyInstance(
                persionBean.getClass().getClassLoader(),
                persionBean.getClass().getInterfaces(), new OwnInvocationHandler(persionBean));
    }

    public void drive() {
        PersionBean persion = new PersionBeanImpl();
        persion.setName("aaa");
        persion.setGender("abcd");
        PersionBean persionBean = getOwnPersionProxy(persion);
        persionBean.setHotOrNotRating(1);
    }

    public static void main(String[] args) {

        ProxyTestDrive drive = new ProxyTestDrive();
        drive.drive();

    }

}


