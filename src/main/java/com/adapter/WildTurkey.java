package com.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void flay() {
        System.out.println("I'm flay a short distance");
    }
}
