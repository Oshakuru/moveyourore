package io.github.oshakuru.moveyourore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * moveyourore mod entrypoint (Fabric, Minecraft 1.20.1).
 *
 * Task 1 placeholder: only proves the project loads. Worldgen wiring comes in Tasks 4-6.
 */
public class MoveYourOre implements ModInitializer {
    public static final String MOD_ID = "moveyourore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("moveyourore initialized");
    }
}
