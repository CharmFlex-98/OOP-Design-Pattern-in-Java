package com.company.factory_method_pattern;

public class MeleeHammer extends Weapon{
    @Override
    public void description() {
        setWeaponDamage(10);
        setWeaponName("Melee Hammer");
        System.out.println("this is "+getWeaponName());
    }
}
