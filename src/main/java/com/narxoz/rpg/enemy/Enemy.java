package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.factory.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Cloneable {

    private String name;
    private int health;
    private int damage;
    private String element;
    private List<Ability> abilities;
    private LootTable lootTable;
    private String aiType;

    public Enemy() {}

    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setDamage(int damage) { this.damage = damage; }
    public void setElement(String element) { this.element = element; }
    public void setAbilities(List<Ability> abilities) { this.abilities = abilities; }
    public void setLootTable(LootTable lootTable) { this.lootTable = lootTable; }
    public void setAiType(String aiType) { this.aiType = aiType; }

    public void multiplyStats(double factor) {
        this.health = (int) (this.health * factor);
        this.damage = (int) (this.damage * factor);
    }

    @Override
    public Enemy clone() {
        try {
            Enemy copy = (Enemy) super.clone();
            copy.abilities = new ArrayList<>(abilities);
            copy.lootTable = lootTable.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Enemy cloning failed");
        }
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", abilities=" + abilities +
                ", loot=" + lootTable +
                ", aiType='" + aiType + '\'' +
                '}';
    }
}
