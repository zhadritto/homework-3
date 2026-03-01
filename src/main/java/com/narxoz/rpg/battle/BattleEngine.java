package com.narxoz.rpg.battle;

import java.util.List;
import java.util.Random;

public final class BattleEngine {

    private static BattleEngine instance;
    private Random random = new Random();

    private BattleEngine() {}

    // ===== Singleton =====
    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public BattleEngine setRandomSeed(long seed) {
        this.random = new Random(seed);
        return this;
    }

    public void reset() {
        this.random = new Random();
    }

    // ===== Battle Simulation =====
    public EncounterResult runEncounter(List<Combatant> teamA, List<Combatant> teamB) {

        EncounterResult result = new EncounterResult();
        int rounds = 0;

        while (!teamA.isEmpty() && !teamB.isEmpty()) {
            rounds++;
            result.addLog("=== Round " + rounds + " ===");

            Combatant attackerA = teamA.get(0);
            Combatant attackerB = teamB.get(0);

            // Team A attacks
            int damageA = calculateDamage(attackerA);
            attackerB.takeDamage(damageA);
            result.addLog(attackerA.getName() + " attacks "
                    + attackerB.getName() + " for " + damageA + " damage.");

            if (!attackerB.isAlive()) {
                result.addLog(attackerB.getName() + " is defeated!");
                teamB.remove(0);
                continue;
            }

            // Team B attacks
            int damageB = calculateDamage(attackerB);
            attackerA.takeDamage(damageB);
            result.addLog(attackerB.getName() + " attacks "
                    + attackerA.getName() + " for " + damageB + " damage.");

            if (!attackerA.isAlive()) {
                result.addLog(attackerA.getName() + " is defeated!");
                teamA.remove(0);
            }
        }

        result.setRounds(rounds);

        if (teamA.isEmpty()) {
            result.setWinner("Enemies");
        } else {
            result.setWinner("Heroes");
        }

        return result;
    }

    private int calculateDamage(Combatant attacker) {
        int baseDamage = attacker.attack();
        int randomBonus = random.nextInt(5); // 0–4 bonus
        return baseDamage + randomBonus;
    }
}