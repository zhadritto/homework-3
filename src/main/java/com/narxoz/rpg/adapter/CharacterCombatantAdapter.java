package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.character.Character;

public class CharacterCombatantAdapter implements Combatant {

    private final Character character;
    private int health;

    public CharacterCombatantAdapter(Character character, int health) {
        this.character = character;
        this.health = health;
    }
    @Override
    public int attack() {
        return getAttack();
    }
    @Override
    public String getName() {
        return character.getClass().getSimpleName();
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return 50;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}