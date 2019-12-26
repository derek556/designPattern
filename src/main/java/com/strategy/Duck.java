package com.strategy;

/**
 * Created by Administrator on 2016/7/7.
 */
public abstract class Duck {

    /**
     * 多用组合，少用继承
     * 针对接口，不针对实现
     */
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void display();

    //执行“飞”的行为
    public void performFly(){
        flyBehavior.fly();
    }

    //执行“叫”的行为
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
