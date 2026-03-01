package com.narxoz.rpg.character.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public class Longbow implements Weapon {
    private final int damage = 30;
    private final String range = "long";

    @Override
    public String getWeaponInfo() {
        return "Longbow (Damage: " + damage + ", Range: " + range + ")";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    public String getRange() {
        return range;
    }
}
