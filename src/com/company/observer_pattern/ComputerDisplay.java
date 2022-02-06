package com.company.observer_pattern;

public class ComputerDisplay implements IObserver{
    public TempData tempData;

    public ComputerDisplay(TempData tempData) {
        this.tempData = tempData;
        this.tempData.add(this);
    }

    @Override
    public void update() {
        System.out.println("data is updated in computer. New temperature is " + tempData.temperature);
    }
}
