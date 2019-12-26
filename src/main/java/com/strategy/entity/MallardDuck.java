package com.strategy.entity;

import com.strategy.Duck;
import com.strategy.fly.FlyWithWhing;
import com.strategy.quack.Quack;

/**
 * Created by Administrator on 2016/7/7.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWhing();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("野鸭");
    }
}
