package com.company.factory_method_pattern;

public class BirdWeaponFactory extends WeaponFactory{
    @Override
    public Weapon makeWeapon(String weaponType) {
        if (weaponType.equals("sword")) {
            return new RangedSword();
        } else if (weaponType.equals("hammer")) {
            return new RangedHammer();
        }
        System.out.println("does not have this weapon!");
        return null;
    }


}
