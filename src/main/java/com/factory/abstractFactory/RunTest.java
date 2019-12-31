package com.factory.abstractFactory;

import com.factory.abstractFactory.factory.OperateSamFactory;
import com.factory.abstractFactory.factory.OperateWillFactory;
import com.factory.abstractFactory.operate.OperateAdd;

public class RunTest {

    public static void main(String[] args) {

        int num1 = 100, num2 = 50;

        OperateFactory operateFactory = new OperateSamFactory();
        OperateAdd operate = operateFactory.operateAdd();
        double samResult = operate.calcuate(num1, num2);
        System.out.println("sam result:" + samResult);

        OperateFactory operateFactoryWill = new OperateWillFactory();
        OperateAdd operateAddWill = operateFactoryWill.operateAdd();
        double willResult = operateAddWill.calcuate(num1, num2);
        System.out.println("will result:" + willResult);


    }

}
