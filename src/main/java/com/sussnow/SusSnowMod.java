package com.sussnow;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SusSnowMod implements ModInitializer {
	public static final String MOD_ID = "sussnow";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Initializing Suspicious Snow.");
		SusSnowBlocks.initialize();

	}
}