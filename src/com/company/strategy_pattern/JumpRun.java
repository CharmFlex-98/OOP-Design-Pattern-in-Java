package com.company.strategy_pattern;

public class JumpRun implements RunBehaviour{
    @Override
    public void run() {
        System.out.println("Run by jumping");
    }
}
