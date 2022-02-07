package com.company.factory_method_pattern;

public abstract class Weapon {

    private String weaponName;
    private double weaponDamage;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String name) {
        weaponName = name;
    }

    public double getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(double damage) {
        weaponDamage = damage;
    }

    public abstract void description();

}
