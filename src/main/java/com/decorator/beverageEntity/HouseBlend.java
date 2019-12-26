package com.decorator.beverageEntity;

import com.decorator.Beverage;

/**
 * Created by Administrator on 2016/7/11.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.98;
    }

}
