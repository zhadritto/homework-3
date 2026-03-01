package com.narxoz.rpg.character;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 100, 50, 20, 20);
    }

    @Override
    public String useSpecialAbility() {
        return name + " fires Rain of Arrows: multiple rapid shots at distant targets!";
    }
}
