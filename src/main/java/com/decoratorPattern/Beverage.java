package com.decoratorPattern;

/**
 * Created by Administrator on 2016/7/11.
 */
public abstract class Beverage {

    public String description = "unknown";

    public String getDescription(){
        return description;
    }

    public abstract double COST();

}
