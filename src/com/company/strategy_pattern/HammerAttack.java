package com.company.strategy_pattern;

public class HammerAttack implements AttackBehaviour{
    @Override
    public void attack() {
        System.out.println("attack with hammer");
    }
}
