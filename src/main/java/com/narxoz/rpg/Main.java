package com.narxoz.rpg;

import com.narxoz.rpg.adapter.CharacterCombatantAdapter;
import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.battle.*;
import com.narxoz.rpg.character.*;
import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.factory.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG Battle Engine Demo ===\n");

        Warrior warrior = new Warrior("Arthas");
        Mage mage = new Mage("Jaina");

        List<Combatant> heroes = new ArrayList<>();
        heroes.add(new CharacterCombatantAdapter(warrior, 30));
        heroes.add(new CharacterCombatantAdapter(mage, 25));


        List<Ability> abilities = new ArrayList<>();
        LootTable loot = new LootTable();

        Goblin goblin = new Goblin(
                "Goblin",
                120,
                15,
                abilities,
                loot,
                "Aggressive"
        );

        List<Combatant> enemies = new ArrayList<>();
        enemies.add(new EnemyCombatantAdapter(goblin));


        BattleEngine engine = BattleEngine.getInstance();
        engine.setRandomSeed(42L);

        EncounterResult result = engine.runEncounter(heroes, enemies);

        System.out.println("Winner: " + result.getWinner());
        System.out.println("Rounds: " + result.getRounds());

        for (String log : result.getBattleLog()) {
            System.out.println(log);
        }

        System.out.println("\n=== Demo Complete ===");
    }
}