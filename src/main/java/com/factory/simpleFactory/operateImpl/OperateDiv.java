package com.factory.simpleFactory.operateImpl;

import com.factory.simpleFactory.Operate;

public class OperateDiv implements Operate {
    public double calcuate(double num1, double num2) {
        return num1/num2;
    }
}
