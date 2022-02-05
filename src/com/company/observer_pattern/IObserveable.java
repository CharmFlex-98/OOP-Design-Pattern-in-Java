package com.company.observer_pattern;

public interface IObserveable {

    void add(IObserver observer);
    void delete(IObserver
                 observer);
    void notifyObservers();
}
