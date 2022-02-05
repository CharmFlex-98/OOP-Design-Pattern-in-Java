package com.company.strategy_pattern;

public class Panda extends Animal{

    public Panda() {
        this.attackBehaviour = new HammerAttack();
        this.runBehaviour = new StraightRun();
    }
}
