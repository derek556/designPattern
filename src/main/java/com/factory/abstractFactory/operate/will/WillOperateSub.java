package com.factory.abstractFactory.operate.will;

import com.factory.abstractFactory.operate.OperateSub;

public class WillOperateSub implements OperateSub {
    @Override
    public double calcuate(double num1, double num2) {
        return num1-num2+200;
    }
}
