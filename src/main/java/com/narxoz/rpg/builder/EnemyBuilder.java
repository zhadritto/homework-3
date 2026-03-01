package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public abstract class EnemyBuilder {

    protected Enemy enemy;
    protected EnemyComponentFactory factory;

    public EnemyBuilder(EnemyComponentFactory factory) {
        this.factory = factory;
        enemy = new Enemy();
        enemy.setAbilities(factory.createAbilities());
        enemy.setLootTable(factory.createLootTable());
        enemy.setAiType(factory.createAIType());
        enemy.setElement(factory.getElement());
    }

    public EnemyBuilder setName(String name) {
        enemy.setName(name);
        return this;
    }

    public EnemyBuilder setHealth(int health) {
        enemy.setHealth(health);
        return this;
    }

    public EnemyBuilder setDamage(int damage) {
        enemy.setDamage(damage);
        return this;
    }

    public Enemy build() {
        return enemy;
    }
}
