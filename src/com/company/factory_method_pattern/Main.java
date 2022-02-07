package com.company.factory_method_pattern;

public class Main {

    public static void main(String[] args) {
       WeaponFactory pandaWeaponFactory = new PandaWeaponFactory();
       pandaWeaponFactory.equipWeapon("sword");
       pandaWeaponFactory.equipWeapon("hammer");

       WeaponFactory birdWeaponFactory= new BirdWeaponFactory();
       birdWeaponFactory.equipWeapon("sword");
       birdWeaponFactory.equipWeapon("sword");
    }
}
