package com.company.observer_pattern;

import com.company.strategy_pattern.Animal;
import com.company.strategy_pattern.Kangaroo;
import com.company.strategy_pattern.Panda;
import com.company.strategy_pattern.SwordAttack;

public class Main {

    public static void main(String[] args) {
        TempData tempData = new TempData();
        tempData.add(new ComputerDisplay(tempData));
       tempData.add(new PhoneDisplay(tempData));

        tempData.setTemperature(50);
    }
}
