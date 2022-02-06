package com.company.decorator_pattern;

public class BigSizeDecorator extends PizzaDecorator{

    public BigSizeDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return this.pizza.description() + "+ large";
    }

    @Override
    public double cost() {
        return this.pizza.cost() * 2;
    }
}
