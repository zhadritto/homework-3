package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.factory.loot.LootTable;

import java.util.List;

public class Goblin extends Enemy {
    public Goblin(String name, int health, int damage, List<Ability> abilities,
                  LootTable lootTable, String aiType) {
        setName(name);
        setHealth(health);
        setDamage(damage);
        setElement("NONE");
        setAbilities(abilities);
        setLootTable(lootTable);
        setAiType(aiType);
    }
}
