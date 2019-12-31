package com.template;

public abstract class CaffeineBeverage {

    final void  prepareRecipe() {
        boileWater();
        brew();
        pourInCup();
        if (customerWantscondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boileWater() {
        System.out.println("Boilling water");
    }

    void pourInCup() {
        System.out.println("pour into cup");
    }

    boolean customerWantscondiments() {//这就是一个钩子
        return true;
    }

}
