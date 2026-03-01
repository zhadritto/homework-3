package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public class EnemyDirector {

    private final BossEnemyBuilder builder;

    public EnemyDirector(BossEnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy createMiniBoss() {
        return builder.setName("Mini Boss")
                .setHealth(10000)
                .setDamage(200)
                .build();
    }

    public Enemy createRaidBoss() {
        return builder.setName("Raid Boss")
                .setHealth(50000)
                .setDamage(600)
                .build();
    }
}
