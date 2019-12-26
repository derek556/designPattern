package com.decorator;

import com.decorator.beverageEntity.Espresso;
import com.decorator.decoratorEntity.Mocha;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Test {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.description+", "+beverage1.cost()+"$");

        Mocha mocha = new Mocha(beverage1);
        System.out.println(mocha.getDescription()+","+mocha.cost()+"$");




    }

}
