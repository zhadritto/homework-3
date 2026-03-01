package com.narxoz.rpg.character.equipment.magic;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EquipmentFactory;
import com.narxoz.rpg.equipment.Weapon;

public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }
}
