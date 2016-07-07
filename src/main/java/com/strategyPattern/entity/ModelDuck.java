package com.strategyPattern.entity;

import com.strategyPattern.Duck;
import com.strategyPattern.fly.FlyNoWay;
import com.strategyPattern.quack.MuteQuack;

/**
 * Created by Administrator on 2016/7/7.
 */
public class ModelDuck extends Duck{

    public void display() {
        System.out.println("model duck display");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


}
