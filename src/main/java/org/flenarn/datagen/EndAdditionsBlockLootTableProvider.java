package org.flenarn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import org.flenarn.blocks.EndAdditionsBlocks;

public class EndAdditionsBlockLootTableProvider extends FabricBlockLootTableProvider {
    public EndAdditionsBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(EndAdditionsBlocks.POLISHED_END_STONE);
        addDrop(EndAdditionsBlocks.POLISHED_END_STONE_STAIRS);
        addDrop(EndAdditionsBlocks.POLISHED_END_STONE_SLAB, slabDrops(EndAdditionsBlocks.POLISHED_END_STONE_SLAB));

        addDrop(EndAdditionsBlocks.END_STONE_TILES);
        addDrop(EndAdditionsBlocks.END_STONE_TILES_STAIRS);
        addDrop(EndAdditionsBlocks.END_STONE_TILES_SLAB, slabDrops(EndAdditionsBlocks.END_STONE_TILES_SLAB));
        addDrop(EndAdditionsBlocks.END_STONE_TILES_WALL);

        addDrop(EndAdditionsBlocks.CHISELED_END_STONE);
    }
}
