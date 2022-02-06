package com.company.decorator_pattern;

public class NormalSizeDecorator extends PizzaDecorator{

    public NormalSizeDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return this.pizza.description() + "+ Big";
    }

    @Override
    public double cost() {
        return this.pizza.cost() * 1;
    }
}
