package com.company.factory_method_pattern;

public abstract class WeaponFactory {

    public abstract Weapon makeWeapon(String weaponType);
    public void  equipWeapon(String weaponType) {
        Weapon weapon = makeWeapon(weaponType);
        weapon.description();
    }

}
