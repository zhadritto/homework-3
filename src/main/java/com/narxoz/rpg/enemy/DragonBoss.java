package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.factory.loot.LootTable;

import java.util.List;

public class DragonBoss extends Enemy {
    public DragonBoss(String name, int health, int damage, String element,
                      List<Ability> abilities, LootTable lootTable, String aiType) {
        setName(name);
        setHealth(health);
        setDamage(damage);
        setElement(element);
        setAbilities(abilities);
        setLootTable(lootTable);
        setAiType(aiType);
    }
}
