package com.factory.abstractFactory.operate.will;

import com.factory.abstractFactory.operate.OperateMul;

public class WillOperateMul implements OperateMul {
    @Override
    public double calcuate(double num1, double num2) {
        return num1*num2+200;
    }
}
