package com.factory.factoryMethod.operateFactoryImpl;

import com.factory.factoryMethod.Operate;
import com.factory.factoryMethod.OperateFactory;
import com.factory.factoryMethod.operateImpl.OperateMul;

public class OperateMulFactory implements OperateFactory {
    @Override
    public Operate getOperate() {
        return new OperateMul();
    }
}
