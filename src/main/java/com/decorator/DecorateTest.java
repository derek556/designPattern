package com.decorator;

import com.decorator.beverageEntity.Espresso;
import com.decorator.decoratorEntity.Mocha;
import com.decorator.decoratorEntity.Whip;

/**
 * Created by Administrator on 2016/7/11.
 */
public class DecorateTest {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();//基本，
        System.out.println(beverage1.description+" = "+beverage1.cost()+"$");

        Mocha mocha = new Mocha(beverage1);//添加一个装饰者
        System.out.println(mocha.getDescription()+" = "+mocha.cost()+"$");

        Whip whip = new Whip(mocha);//再添加一个装饰者
        System.out.println(whip.getDescription()+" = "+whip.cost()+"$");



    }

}
