package com.decorator.decoratorEntity;

import com.decorator.Beverage;
import com.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+" + whip";
    }

    public double cost() {
        return beverage.cost()+1.1;
    }
}
