package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class EnchantedRobes implements Armor {
    private final int defense = 10;
    private final int manaBoost = 25;

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Defense: " + defense + ", Mana Boost: " + manaBoost + ")";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public int getManaBoost() {
        return manaBoost;
    }
}
