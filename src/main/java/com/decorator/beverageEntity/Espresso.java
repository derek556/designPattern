package com.decorator.beverageEntity;

import com.decorator.Beverage;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
