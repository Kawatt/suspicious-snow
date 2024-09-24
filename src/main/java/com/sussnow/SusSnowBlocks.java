package com.sussnow;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SusSnowBlocks {

    public static final SoundEvent ITEM_BRUSH_BRUSHING_SNOW = registerSoundEvent("item.brush.brushing.snow");
    public static final SoundEvent ITEM_BRUSH_BRUSHING_SNOW_COMPLETE = registerSoundEvent("item.brush.brushing.snow.complete");

    public static final SoundEvent BLOCK_SUSPICIOUS_SNOW_BREAK = registerSoundEvent("block.suspicious_snow.break");
    public static final SoundEvent BLOCK_SUSPICIOUS_SNOW_STEP = registerSoundEvent("block.suspicious_snow.step");
    public static final SoundEvent BLOCK_SUSPICIOUS_SNOW_PLACE = registerSoundEvent("block.suspicious_snow.place");
    public static final SoundEvent BLOCK_SUSPICIOUS_SNOW_HIT = registerSoundEvent("block.suspicious_snow.hit");
    public static final SoundEvent BLOCK_SUSPICIOUS_SNOW_FALL = registerSoundEvent("block.suspicious_snow.land");

    public static final BlockSoundGroup SUSPICIOUS_SNOW_SOUNDS = new BlockSoundGroup(1.0F, 1.0F,
            BLOCK_SUSPICIOUS_SNOW_BREAK, BLOCK_SUSPICIOUS_SNOW_STEP,
            BLOCK_SUSPICIOUS_SNOW_PLACE, BLOCK_SUSPICIOUS_SNOW_HIT, BLOCK_SUSPICIOUS_SNOW_FALL);

    public static final Block SUSPICIOUS_SNOW_BLOCK;
    public static final BlockEntityType<SusSnowBlockEntity> SUSPICIOUS_SNOW_BLOCK_ENTITY;

    static {
        //Block
        SUSPICIOUS_SNOW_BLOCK = Registry.register(Registries.BLOCK, new Identifier(SusSnowMod.MOD_ID, "suspicious_snow"), new SusSnowBlock(Blocks.POWDER_SNOW, FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).sounds(SUSPICIOUS_SNOW_SOUNDS), ITEM_BRUSH_BRUSHING_SNOW, ITEM_BRUSH_BRUSHING_SNOW_COMPLETE));
        //BlockItem
        Registry.register(Registries.ITEM, new Identifier(SusSnowMod.MOD_ID, "suspicious_snow"), new BlockItem(SUSPICIOUS_SNOW_BLOCK, new Item.Settings()));
        //BlockEntity
        SUSPICIOUS_SNOW_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SusSnowMod.MOD_ID, "suspicious_snow"), BlockEntityType.Builder.create(SusSnowBlockEntity::new, SUSPICIOUS_SNOW_BLOCK).build(null));
    }

    public static void initialize() {}

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SusSnowMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

}
