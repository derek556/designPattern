package com.decorator;

/**
 * Created by Administrator on 2016/7/11.
 * 基类
 */
public abstract class Beverage {

    public String description = "unknown";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
