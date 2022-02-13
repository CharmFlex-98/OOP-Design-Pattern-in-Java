package com.company.adapter_pattern;

public class MyDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("my duck is quacking");
    }

    @Override
    public void fly() {
        System.out.println("my duck is flying");
    }
}
