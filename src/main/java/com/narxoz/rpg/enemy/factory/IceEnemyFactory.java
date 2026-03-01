package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.factory.loot.LootTable;

import java.util.List;

public class IceEnemyFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(new Ability("Ice Shard", 40), new Ability("Freeze", 15));
    }

    @Override
    public LootTable createLootTable() {
        LootTable loot = new LootTable();
        loot.addItem("Ice Crystal");
        loot.addItem("Frozen Core");
        return loot;
    }

    @Override
    public String createAIType() {
        return "Defensive";
    }

    @Override
    public String getElement() {
        return "ICE";
    }
}
