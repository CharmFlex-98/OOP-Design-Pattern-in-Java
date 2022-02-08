package com.company.command_pattern;

public class Television {
    private double volume = 10;

    public void upVolume() {
        volume++;
    }

    public void downVolume() {
        volume--;
    }

    public double getVolume() {
        return volume;
    }
}
