package com.narxoz.rpg.character;

public class Mage extends Character {
    public Mage(String name) {
        super(name, 70, 150, 5, 35);
    }

    @Override
    public String useSpecialAbility() {
        return name + " casts Arcane Blast: consumes mana to deal massive magic damage!";
    }
}
