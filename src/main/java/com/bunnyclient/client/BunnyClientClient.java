package com.bunnyclient.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class BunnyClientClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("BunnyClient-Client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Bunny Client loaded! Ready for PvP action!");
        
        // Initialize client-side features
        // - Custom HUD
        // - PvP Utils
        // - Performance tweaks
    }
}
