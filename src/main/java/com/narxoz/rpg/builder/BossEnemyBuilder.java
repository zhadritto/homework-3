package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class BossEnemyBuilder extends BasicEnemyBuilder {

    public BossEnemyBuilder(EnemyComponentFactory factory) {
        super(factory);
    }

    @Override
    public Enemy build() {
        return super.build();
    }
}
