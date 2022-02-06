package com.company.decorator_pattern;

public class ClassicalPizza extends Pizza{
    @Override
    public String description() {
        return "Classical Pizza ";
    }

    @Override
    public double cost() {
        return 30;
    }
}
