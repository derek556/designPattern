package com.factory.factoryMethod;

import com.factory.factoryMethod.operateFactoryImpl.OperateAddFactory;

public class RunTest {

    public static void main(String[] args) {

        OperateFactory operateFactory = new OperateAddFactory();
        Operate operate = operateFactory.getOperate();
        double result = operate.calcuate(100, 20);
        System.out.println(result);

    }

}
