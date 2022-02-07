package com.company.factory_method_pattern;

public class MeleeSword extends Weapon{
    @Override
    public void description() {
        setWeaponDamage(10);
        setWeaponName("Melee Sword");
        System.out.println("this is "+getWeaponName());
    }
}
