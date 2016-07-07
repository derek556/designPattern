package com.strategyPattern;

import com.strategyPattern.entity.MallardDuck;
import com.strategyPattern.entity.ModelDuck;
import com.strategyPattern.fly.FlyNoWay;

/**
 * Created by Administrator on 2016/7/7.
 */
public class Test {

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("=============================================");

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        //动态改变其行为
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();

    }

}
