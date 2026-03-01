package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class WizardStaff implements Weapon {
    private final int damage = 15;
    private final int manaBoost = 20;

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Damage: " + damage + ", Mana Boost: " + manaBoost + ")";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public int getManaBoost() {
        return manaBoost;
    }
}
