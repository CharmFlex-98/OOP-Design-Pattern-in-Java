package com.company.factory_method_pattern;

public class RangedHammer extends Weapon{
    @Override
    public void description() {
        setWeaponDamage(20);
        setWeaponName("Ranged Hammer");
        System.out.println("this is "+getWeaponName());
    }
}
