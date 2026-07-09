package com.bunnyclient;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BunnyClient implements ModInitializer {
    public static final String MOD_ID = "bunnyclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Bunny Client - Your PvP companion!");
    }
}
