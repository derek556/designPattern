package com.factory.abstractFactory.factory;

import com.factory.abstractFactory.OperateFactory;
import com.factory.abstractFactory.operate.OperateAdd;
import com.factory.abstractFactory.operate.OperateDiv;
import com.factory.abstractFactory.operate.OperateMul;
import com.factory.abstractFactory.operate.OperateSub;
import com.factory.abstractFactory.operate.sam.SamOperateAdd;
import com.factory.abstractFactory.operate.sam.SamOperateDiv;
import com.factory.abstractFactory.operate.sam.SamOperateMul;
import com.factory.abstractFactory.operate.sam.SamOperateSub;

public class OperateSamFactory implements OperateFactory {


    @Override
    public OperateAdd operateAdd() {
        return new SamOperateAdd();
    }

    @Override
    public OperateSub calcuateSub() {
        return new SamOperateSub();
    }

    @Override
    public OperateMul calcuateMul() {
        return new SamOperateMul();
    }

    @Override
    public OperateDiv calcuateDiv() {
        return new SamOperateDiv();
    }
}
