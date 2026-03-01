package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.Ability;
import com.narxoz.rpg.enemy.factory.loot.LootTable;

import java.util.List;

public interface EnemyComponentFactory {
    List<Ability> createAbilities();
    LootTable createLootTable();
    String createAIType();
    String getElement();
}
