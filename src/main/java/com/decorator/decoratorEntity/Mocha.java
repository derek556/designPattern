package com.decorator.decoratorEntity;

import com.decorator.Beverage;
import com.decorator.CondimentDecorator;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;//被装饰的对象

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+",+ Mocha";
    }

    public double cost() {
        return beverage.cost()+0.2;
    }
}
