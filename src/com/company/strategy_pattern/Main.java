package com.company.strategy_pattern;

import com.company.strategy_pattern.Animal;
import com.company.strategy_pattern.Kangaroo;
import com.company.strategy_pattern.Panda;
import com.company.strategy_pattern.SwordAttack;

public class Main {

    public static void main(String[] args) {
        Animal panda = new Panda();
        panda.attack();
        panda.run();

        Animal kangaroo = new Kangaroo();
        kangaroo.attack();
        kangaroo.run();


        panda.setAttackBehaviour(new SwordAttack());
        panda.attack();

        kangaroo.setRunBehaviour(new StraightRun());
        kangaroo.run();
    }
}
