package com.company.factory_method_pattern;

public class RangedSword extends Weapon{
    @Override
    public void description() {
        setWeaponDamage(30);
        setWeaponName("Ranged Sword");
        System.out.println("this is "+getWeaponName());
    }
}
