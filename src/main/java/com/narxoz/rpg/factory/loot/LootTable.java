package com.narxoz.rpg.factory.loot;

import java.util.ArrayList;
import java.util.List;

public class LootTable implements Cloneable {
    private final List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public LootTable clone() {
        try {
            LootTable copy = (LootTable) super.clone();
            copy.items.addAll(this.items);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("LootTable cloning failed");
        }
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
