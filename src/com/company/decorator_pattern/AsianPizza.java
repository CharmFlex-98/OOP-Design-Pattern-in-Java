package com.company.decorator_pattern;

public class AsianPizza extends Pizza{
    @Override
    public String description() {
        return "Asian Pizza ";
    }

    @Override
    public double cost() {
        return 10;
    }
}
