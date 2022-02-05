package com.company.strategy_pattern;

public class SwordAttack implements AttackBehaviour{
    @Override
    public void attack() {
        System.out.println("attack with sword");
    }
}
