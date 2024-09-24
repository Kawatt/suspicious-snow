package com.sussnow;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.BrushableBlockEntity;
import net.minecraft.util.math.BlockPos;

public class SusSnowBlockEntity extends BrushableBlockEntity {

    public SusSnowBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return SusSnowBlocks.SUSPICIOUS_SNOW_BLOCK_ENTITY;
    }
}
