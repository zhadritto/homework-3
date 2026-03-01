package com.narxoz.rpg.enemy.builder;

import com.narxoz.rpg.enemy.Enemy;

import java.util.HashMap;
import java.util.Map;

public class EnemyRegistry {

    private final Map<String, Enemy> templates = new HashMap<>();

    public void registerTemplate(String key, Enemy enemy) {
        templates.put(key, enemy);
    }

    public Enemy createFromTemplate(String key) {
        return templates.get(key).clone();
    }
}
