package com.company.strategy_pattern;

public class StraightRun implements RunBehaviour{
    @Override
    public void run() {
        System.out.println("run straight");
    }
}
