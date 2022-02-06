package com.company.strategy_pattern;

public abstract class Animal {
    public AttackBehaviour attackBehaviour;
    public RunBehaviour runBehaviour;

    public void attack() {
        attackBehaviour.attack();
    }

    public void run() {
        runBehaviour.run();
    }

    public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
    }

    public void setRunBehaviour(RunBehaviour runBehaviour) {
        this.runBehaviour = runBehaviour;
    }


}
