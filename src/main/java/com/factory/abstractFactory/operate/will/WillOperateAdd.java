package com.factory.abstractFactory.operate.will;

import com.factory.abstractFactory.operate.OperateAdd;

public class WillOperateAdd implements OperateAdd {
    @Override
    public double calcuate(double num1, double num2) {
        return num1+num2+200;
    }
}
