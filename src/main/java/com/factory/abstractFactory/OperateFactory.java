package com.factory.abstractFactory;

import com.factory.abstractFactory.operate.OperateAdd;
import com.factory.abstractFactory.operate.OperateDiv;
import com.factory.abstractFactory.operate.OperateMul;
import com.factory.abstractFactory.operate.OperateSub;

public interface OperateFactory {
    public OperateAdd operateAdd();
    public OperateSub calcuateSub();
    public OperateMul calcuateMul();
    public OperateDiv calcuateDiv();
}
