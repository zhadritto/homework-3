package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class LeatherArmor implements Armor {
    private final int defense = 20;
    private final int agilityBonus = 5;

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Defense: " + defense + ", Agility: +" + agilityBonus + ")";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }
}
