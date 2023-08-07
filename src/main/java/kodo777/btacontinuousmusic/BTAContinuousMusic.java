package kodo777.btacontinuousmusic;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BTAContinuousMusic implements ModInitializer {
    public static final String MOD_ID = "btacontinuousmusic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("BTAContinuousMusic initialized.");
    }
}
