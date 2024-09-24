package com.sussnow;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SusSnowModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockEntityRendererFactories.register(SusSnowBlocks.SUSPICIOUS_SNOW_BLOCK_ENTITY, SusSnowBlockEntityRenderer::new);

	}
}