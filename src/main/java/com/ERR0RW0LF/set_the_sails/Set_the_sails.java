package com.ERR0RW0LF.set_the_sails;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Set_the_sails implements ModInitializer {
    public static final String MOD_ID = "set_the_sails";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Started Mod");
    }
}
