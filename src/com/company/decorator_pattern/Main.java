package com.company.decorator_pattern;

import com.company.observer_pattern.ComputerDisplay;
import com.company.observer_pattern.PhoneDisplay;
import com.company.observer_pattern.TempData;

public class Main {

    public static void main(String[] args) {
        Pizza order = new BigSizeDecorator(new KimchiDecorator(new CheeseDecorator(new PineAppleDecorator(new AsianPizza()))));
        System.out.println(order.description());
        System.out.println(order.cost());
    }
}
