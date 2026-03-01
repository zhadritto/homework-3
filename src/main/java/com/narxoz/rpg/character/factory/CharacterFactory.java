package com.narxoz.rpg.character.factory;

import com.narxoz.rpg.character.Character;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<String, CharacterCreator> registry = new HashMap<>();

    public void register(String type, CharacterCreator creator) {
        registry.put(type.toLowerCase(), creator);
    }

    public Character create(String type, String name) {
        CharacterCreator creator = registry.get(type.toLowerCase());
        if (creator == null) {
            throw new IllegalArgumentException("Unknown character type: " + type);
        }
        return creator.createCharacter(name);
    }
}
