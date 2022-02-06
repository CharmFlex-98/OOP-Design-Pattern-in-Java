package com.company.decorator_pattern;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String description() {
       return this.pizza.description() + "+ Cheese";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 5;
    }
}
