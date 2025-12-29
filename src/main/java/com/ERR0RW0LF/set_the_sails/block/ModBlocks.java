package com.ERR0RW0LF.set_the_sails.block;

import com.ERR0RW0LF.set_the_sails.Set_the_sails;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PLANK_BLOCK = registerBlock("plank_block",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.BAMBOO_WOOD)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Set_the_sails.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Set_the_sails.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Set_the_sails.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Set_the_sails.LOGGER.info("Registering Mod Blocks for " + Set_the_sails.MOD_ID);
    }
}
