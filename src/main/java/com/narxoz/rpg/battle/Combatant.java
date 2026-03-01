package com.narxoz.rpg.battle;

public interface Combatant {
    String getName();
    int attack();
    int getHealth();
    int getAttack();
    void takeDamage(int damage);
    boolean isAlive();
}
