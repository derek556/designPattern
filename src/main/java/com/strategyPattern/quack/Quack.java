package com.strategyPattern.quack;

import com.strategyPattern.QuackBehavior;

/**
 * Created by Administrator on 2016/7/7.
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }

}
