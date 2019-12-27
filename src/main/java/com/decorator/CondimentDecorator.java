package com.decorator;

/**
 * Created by Administrator on 2016/7/11.
 * 装饰者共同实现的接口（也可以是抽象类）
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
