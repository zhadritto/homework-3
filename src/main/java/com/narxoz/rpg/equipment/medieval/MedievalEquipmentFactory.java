package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EquipmentFactory;
import com.narxoz.rpg.equipment.Weapon;

public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
