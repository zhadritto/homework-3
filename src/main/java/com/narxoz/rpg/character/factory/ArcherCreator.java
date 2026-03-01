package com.narxoz.rpg.character.factory;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;

public class ArcherCreator extends CharacterCreator {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
