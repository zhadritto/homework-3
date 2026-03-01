package com.narxoz.rpg.character.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public class PlateArmor implements Armor {
    private final int defense = 30;

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Defense: " + defense + ")";
    }

    @Override
    public int getDefense() {
        return defense;
    }
}
