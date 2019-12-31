package com.factory.factoryMethod.operateFactoryImpl;

import com.factory.factoryMethod.Operate;
import com.factory.factoryMethod.OperateFactory;
import com.factory.factoryMethod.operateImpl.OperateDiv;

public class OperateDivFactory implements OperateFactory {
    @Override
    public Operate getOperate() {
        return new OperateDiv();
    }
}
