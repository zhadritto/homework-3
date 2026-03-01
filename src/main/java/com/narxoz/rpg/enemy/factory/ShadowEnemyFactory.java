package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.factory.loot.LootTable;

import java.util.List;

public class ShadowEnemyFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(new Ability("Shadow Strike", 60), new Ability("Life Drain", 25));
    }

    @Override
    public LootTable createLootTable() {
        LootTable loot = new LootTable();
        loot.addItem("Shadow Essence");
        loot.addItem("Cursed Relic");
        return loot;
    }

    @Override
    public String createAIType() {
        return "Sneaky";
    }

    @Override
    public String getElement() {
        return "SHADOW";
    }
}
