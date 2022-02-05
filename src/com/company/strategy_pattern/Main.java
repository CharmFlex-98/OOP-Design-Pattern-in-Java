package com.company.strategy_pattern;

import com.company.strategy_pattern.Animal;
import com.company.strategy_pattern.Kangaroo;
import com.company.strategy_pattern.Panda;
import com.company.strategy_pattern.SwordAttack;

public class Main {

    public static void main(String[] args) {
        Animal panda = new Panda();
        panda.attackBehaviour.attack();
        panda.runBehaviour.run();

        Animal kangaroo = new Kangaroo();
        kangaroo.attackBehaviour.attack();
        kangaroo.runBehaviour.run();

        panda.setAttackBehaviour(new SwordAttack());
        panda.attackBehaviour.attack();
    }
}
