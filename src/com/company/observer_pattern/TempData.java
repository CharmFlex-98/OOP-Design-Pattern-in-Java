package com.company.observer_pattern;

import java.util.ArrayList;

public class TempData implements IObserveable{
    public double temperature = 20;
    public ArrayList<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer:observers) {
            observer.update();
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
