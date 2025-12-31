package com.ERR0RW0LF.set_the_sails;

import com.ERR0RW0LF.set_the_sails.block.ModBlocks;
import com.ERR0RW0LF.set_the_sails.item.ModItemGroups;
import com.ERR0RW0LF.set_the_sails.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Set_the_sails implements ModInitializer {
    public static final String MOD_ID = "set_the_sails";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Started Mod");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModItemGroups.registerItemGroups();
    }
}
