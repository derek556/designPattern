package com.strategy.entity;

import com.strategy.Duck;
import com.strategy.fly.FlyNoWay;
import com.strategy.quack.MuteQuack;

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
