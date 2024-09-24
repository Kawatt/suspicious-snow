package com.sussnow;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SusSnowModClient implements ClientModInitializer {

	public static final String MOD_ID = "sussnow";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("CLIENT INITIALIZED");
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockEntityRendererFactories.register(SusSnowBlocks.SUSPICIOUS_SNOW_BLOCK_ENTITY, SusSnowBlockEntityRenderer::new);
	}
}