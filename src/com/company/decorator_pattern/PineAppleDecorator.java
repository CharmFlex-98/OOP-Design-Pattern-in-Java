package com.company.decorator_pattern;

public class PineAppleDecorator extends PizzaDecorator{

    public PineAppleDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return this.pizza.description() + "+ Pineapple";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 5;
    }
}
