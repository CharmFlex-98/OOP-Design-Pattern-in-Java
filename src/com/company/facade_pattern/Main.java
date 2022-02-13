package com.company.facade_pattern;

public class Main {

    public static void main(String[] args) {
        // very simple version of facade pattern example
        Facade tvFacade = new Facade(new Television(), new Speaker());
        tvFacade.watchV();
    }
}
