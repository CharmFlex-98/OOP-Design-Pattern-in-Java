package com.company.adapter_pattern;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MyDuck();
        Turkey turkey = new MyTurkey();

        System.out.println("Duck action ***");
        duckAction(duck);

        System.out.println("turkey action ***");
        turkey.turkeyQuack();
        turkey.turkeyFly();

        System.out.println("TurkeyAdapter action ***");
        Duck anotherDuck = new TurkeyAdapter(turkey);
        duckAction(anotherDuck);

    }

    public static void duckAction(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
