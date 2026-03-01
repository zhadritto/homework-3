package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;

public class BossEnemyBuilder extends BasicEnemyBuilder {

    public BossEnemyBuilder(EnemyComponentFactory factory) {
        super(factory);
    }

    @Override
    public Enemy build() {
        return super.build();
    }
}
