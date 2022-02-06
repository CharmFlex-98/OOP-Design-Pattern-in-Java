package com.company.observer_pattern;

public class PhoneDisplay implements IObserver{
    public TempData tempData;

    public PhoneDisplay(TempData tempData) {
        this.tempData = tempData;
        this.tempData.add(this);
    }

    @Override
    public void update() {
        System.out.println("data is updated in phone. New temperature is " + tempData.temperature);
    }
}
