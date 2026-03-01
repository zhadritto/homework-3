package com.narxoz.rpg.character;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150, 20, 30, 10);
    }

    @Override
    public String useSpecialAbility() {
        return name + " uses Berserk Strike: deals heavy physical damage!";
    }
}
