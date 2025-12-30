package com.ERR0RW0LF.set_the_sails.item;

import com.ERR0RW0LF.set_the_sails.Set_the_sails;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PLANK = registerItems("plank", new Item(new Item.Settings()));

    public static Item registerItems(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Set_the_sails.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Set_the_sails.LOGGER.info("Registering Mod Items for " + Set_the_sails.MOD_ID);
    }

}
