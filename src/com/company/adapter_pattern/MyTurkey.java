package com.company.adapter_pattern;

public class MyTurkey implements Turkey{
    @Override
    public void turkeyQuack() {
        System.out.println("my turkey is quacking in turkey style");
    }

    @Override
    public void turkeyFly() {
        System.out.println("my turkey is flying with turkey style");
    }
}
