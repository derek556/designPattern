package com.factory.simpleFactory;

import com.factory.simpleFactory.operateImpl.OperateAdd;
import com.factory.simpleFactory.operateImpl.OperateDiv;
import com.factory.simpleFactory.operateImpl.OperateMul;
import com.factory.simpleFactory.operateImpl.OperateSub;

public class OperateFactory {

    public static Operate getOperate(String operateStr) {

        switch (operateStr) {//分支判断，当增加新的分支的时候，需要修改此处代码，违反类开闭原则
            case "+":
                return new OperateAdd();
            case "-":
                return new OperateSub();
            case "*":
                return new OperateMul();
            case "/":
                return new OperateDiv();
        }
        return null;

    }

}
