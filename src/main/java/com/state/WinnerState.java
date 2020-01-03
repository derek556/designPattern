package com.state;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! you get two gumballs for your quarter");
        gumballMachine.releaseBall();//释放第一个糖果
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();//释放第二个糖果
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
