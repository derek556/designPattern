package com.adapter;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I'm fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
