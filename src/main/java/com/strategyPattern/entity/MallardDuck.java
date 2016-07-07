package com.strategyPattern.entity;

import com.strategyPattern.Duck;
import com.strategyPattern.fly.FlyWithWhing;
import com.strategyPattern.quack.Quack;

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
