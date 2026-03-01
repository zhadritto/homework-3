package com.narxoz.rpg.enemy.combat;

public class Ability {
    private final String name;
    private final int power;

    public Ability(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString() {
        return name + "(" + power + ")";
    }
}
