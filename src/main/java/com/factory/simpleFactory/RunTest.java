package com.factory.simpleFactory;

public class RunTest {

    public static void main(String[] args) {

        int num1 = 100,num2 =10;
        Operate operate = OperateFactory.getOperate("+");
        Object result = operate.calcuate(num1, num2);
        System.out.println(result);

    }

}
