package com.company.decorator_pattern;

public class KimchiDecorator extends PizzaDecorator{

    public KimchiDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
        return this.pizza.description() + "+ kimchi";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 3;
    }
}
