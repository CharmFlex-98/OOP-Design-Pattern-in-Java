package com.company.strategy_pattern;

public class Kangaroo extends Animal{

    public Kangaroo() {
        this.attackBehaviour = new SwordAttack();
        this.runBehaviour = new StraightRun();
    }
}
