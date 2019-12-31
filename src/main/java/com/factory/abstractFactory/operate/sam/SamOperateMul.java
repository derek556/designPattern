package com.factory.abstractFactory.operate.sam;

import com.factory.abstractFactory.operate.OperateMul;

public class SamOperateMul implements OperateMul {
    @Override
    public double calcuate(double num1, double num2) {
        return num1*num2+100;
    }
}
