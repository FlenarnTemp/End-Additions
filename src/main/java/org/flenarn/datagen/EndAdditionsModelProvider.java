package org.flenarn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import org.flenarn.blocks.EndAdditionsBlocks;

public class EndAdditionsModelProvider extends FabricModelProvider {
    public EndAdditionsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool polished_end_stone_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(EndAdditionsBlocks.POLISHED_END_STONE);
        polished_end_stone_pool.slab(EndAdditionsBlocks.POLISHED_END_STONE_SLAB);
        polished_end_stone_pool.stairs(EndAdditionsBlocks.POLISHED_END_STONE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool end_stone_tiles_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(EndAdditionsBlocks.END_STONE_TILES);
        end_stone_tiles_pool.slab(EndAdditionsBlocks.END_STONE_TILES_SLAB);
        end_stone_tiles_pool.stairs(EndAdditionsBlocks.END_STONE_TILES_STAIRS);
        end_stone_tiles_pool.wall(EndAdditionsBlocks.END_STONE_TILES_WALL);


        blockStateModelGenerator.registerAxisRotated(EndAdditionsBlocks.CHISELED_END_STONE, TexturedModel.CUBE_COLUMN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
