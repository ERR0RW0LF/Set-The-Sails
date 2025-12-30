package com.ERR0RW0LF.set_the_sails.item;

import com.ERR0RW0LF.set_the_sails.Set_the_sails;
import com.ERR0RW0LF.set_the_sails.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup SET_THE_SAILS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Set_the_sails.MOD_ID, "set_the_sails_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLANK))
                    .displayName(Text.translatable("itemGroup.set_the_sails.set_the_sails_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLANK);
                        entries.add(ModBlocks.PLANK_BLOCK);

                        entries.add(ModItems.HAMMER);
                    }).build());

    public static void registerItemGroups() {
        Set_the_sails.LOGGER.info("Registering Item Groups for " + Set_the_sails.MOD_ID);
    }
}
