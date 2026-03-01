package com.narxoz.rpg.character;

public abstract class Character {
    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Character(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() { return name; }

    public String getStats() {
        return String.format("Name: %s\nHealth: %d\nMana: %d\nStrength: %d\nIntelligence: %d",
                name, health, mana, strength, intelligence);
    }

    public abstract String useSpecialAbility();
}
