package com.company.factory_method_pattern;

public class PandaWeaponFactory extends WeaponFactory{
    @Override
    public Weapon makeWeapon(String weaponType) {
        if (weaponType.equals("sword")) {
            return new MeleeSword();
        } else if (weaponType.equals("hammer")) {
            return new MeleeHammer();
        }
        System.out.println("does not have this weapon!");
        return null;
    }
}
