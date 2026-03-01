package com.narxoz.rpg.battle;

public interface Combatant {
    String getName();
    int getHealth();
    int getAttack();
    void takeDamage(int damage);
    boolean isAlive();
}
