package org.flenarn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import org.flenarn.blocks.EndAdditionsBlocks;

import java.util.concurrent.CompletableFuture;

public class EndAdditionsBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public EndAdditionsBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(EndAdditionsBlocks.POLISHED_END_STONE)
                .add(EndAdditionsBlocks.POLISHED_END_STONE_SLAB)
                .add(EndAdditionsBlocks.POLISHED_END_STONE_STAIRS)
                .add(EndAdditionsBlocks.END_STONE_TILES)
                .add(EndAdditionsBlocks.END_STONE_TILES_SLAB)
                .add(EndAdditionsBlocks.END_STONE_TILES_STAIRS)
                .add(EndAdditionsBlocks.END_STONE_TILES_WALL)
                .add(EndAdditionsBlocks.CHISELED_END_STONE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(EndAdditionsBlocks.END_STONE_TILES_WALL);
    }
}
