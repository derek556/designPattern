package com.singleton;

public class SingletonTest {

    private volatile static String object;//volatile,防止重排序。static:随类一起加载

    public static String testInstance() {

        if (object == null) {
            synchronized (SingletonTest.class) {//添加类锁，未得到锁不能调用static方法
                if (object == null) {
                    object = "a";
                    return object;
                }
            }
        }
        return object;

    }

}
