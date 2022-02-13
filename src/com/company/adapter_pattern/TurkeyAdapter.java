package com.company.adapter_pattern;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.turkeyQuack();
    }

    @Override
    public void fly() {
        turkey.turkeyFly();
        System.out.println("but will adjust to be like a duck");
    }
}
