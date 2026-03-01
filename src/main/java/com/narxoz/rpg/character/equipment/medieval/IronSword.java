package com.narxoz.rpg.character.equipment.medieval;

import com.narxoz.rpg.equipment.Weapon;

public class IronSword implements Weapon {
    private final int damage = 25;

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Damage: " + damage + ")";
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
