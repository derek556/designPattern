package com.factory.abstractFactory.factory;

import com.factory.abstractFactory.OperateFactory;
import com.factory.abstractFactory.operate.OperateAdd;
import com.factory.abstractFactory.operate.OperateDiv;
import com.factory.abstractFactory.operate.OperateMul;
import com.factory.abstractFactory.operate.OperateSub;
import com.factory.abstractFactory.operate.will.WillOperateAdd;
import com.factory.abstractFactory.operate.will.WillOperateDiv;
import com.factory.abstractFactory.operate.will.WillOperateMul;
import com.factory.abstractFactory.operate.will.WillOperateSub;

public class OperateWillFactory implements OperateFactory {

    @Override
    public OperateAdd operateAdd() {
        return new WillOperateAdd();
    }

    @Override
    public OperateSub calcuateSub() {
        return new WillOperateSub();
    }

    @Override
    public OperateMul calcuateMul() {
        return new WillOperateMul();
    }

    @Override
    public OperateDiv calcuateDiv() {
        return new WillOperateDiv();
    }
}
