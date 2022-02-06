package com.company.observer_pattern;

import com.company.strategy_pattern.Animal;
import com.company.strategy_pattern.Kangaroo;
import com.company.strategy_pattern.Panda;
import com.company.strategy_pattern.SwordAttack;

public class Main {

    public static void main(String[] args) {
        TempData tempData = new TempData();
        ComputerDisplay computerDisplay = new ComputerDisplay(tempData);
        PhoneDisplay phoneDisplay = new PhoneDisplay(tempData);

        tempData.setTemperature(50);
        tempData.setTemperature(100);
    }
}
