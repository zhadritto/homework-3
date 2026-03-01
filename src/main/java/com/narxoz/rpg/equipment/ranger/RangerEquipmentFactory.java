package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.EquipmentFactory;
import com.narxoz.rpg.equipment.Weapon;

public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
