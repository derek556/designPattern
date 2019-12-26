package com.strategy.quack;

import com.strategy.QuackBehavior;

/**
 * Created by Administrator on 2016/7/7.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< silence >>");
    }
}
