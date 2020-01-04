package com.proxy;

import com.proxy.dynamic.CglibProxy;
import com.proxy.dynamic.PersionBeanImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class CglibProxyDrive {


    public static void main(String[] args) {

//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/....");


        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersionBeanImpl.class);
        enhancer.setCallback(new CglibProxy());


        PersionBeanImpl persionBean = (PersionBeanImpl) enhancer.create();
        String name = persionBean.getName();
        System.out.println("name:"+name);
        persionBean.setHotOrNotRating(1);


    }

}
