package org.flenarn.blocks;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.flenarn.EndAdditions;

public class EndAdditionsBlocks {

    public static final Block POLISHED_END_STONE = registerBlockWithItem("polished_end_stone", new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block POLISHED_END_STONE_SLAB = registerBlockWithItem("polished_end_stone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlockWithItem("polished_end_stone_stairs", new StairsBlock(POLISHED_END_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_STAIRS)));

    public static final Block END_STONE_TILES = registerBlockWithItem("end_stone_tiles", new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_TILES_SLAB = registerBlockWithItem("end_stone_tiles_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final Block END_STONE_TILES_STAIRS = registerBlockWithItem("end_stone_tiles_stairs", new StairsBlock(END_STONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_STAIRS)));
    public static final Block END_STONE_TILES_WALL = registerBlockWithItem("end_stone_tiles_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICK_WALL)));

    public static final Block CHISELED_END_STONE = registerBlockWithItem("chiseled_end_stone", new PillarBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EndAdditions.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(EndAdditions.MOD_ID, name), block);
    }

    public static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return registerBlock(name, block);
    }

    public static void registerBlocks() {
        EndAdditions.LOGGER.info("Registering blocks for " + EndAdditions.MOD_ID + ".");
    }

}
