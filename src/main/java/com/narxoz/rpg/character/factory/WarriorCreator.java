package com.narxoz.rpg.character.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;

public class WarriorCreator extends CharacterCreator {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}
