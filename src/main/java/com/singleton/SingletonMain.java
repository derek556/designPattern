package com.singleton;

public class SingletonMain {

    public static void main(String[] args) throws InterruptedException {

        String s = SingletonTest.testInstance();
        System.out.println(s);
    }

}
