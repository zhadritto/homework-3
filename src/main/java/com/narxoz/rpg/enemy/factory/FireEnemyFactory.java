package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.factory.loot.LootTable;

import java.util.List;

public class FireEnemyFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(new Ability("Fireball", 50), new Ability("Burn", 20));
    }

    @Override
    public LootTable createLootTable() {
        LootTable loot = new LootTable();
        loot.addItem("Fire Scale");
        loot.addItem("Burning Core");
        return loot;
    }

    @Override
    public String createAIType() {
        return "Aggressive";
    }

    @Override
    public String getElement() {
        return "FIRE";
    }
}
