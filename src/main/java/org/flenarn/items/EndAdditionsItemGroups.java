package org.flenarn.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.flenarn.EndAdditions;



import static org.flenarn.blocks.EndAdditionsBlocks.*;

public class EndAdditionsItemGroups {

    public static final ItemGroup END_ADDITONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EndAdditions.MOD_ID, "end_additions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.EndAdditions"))
                    .icon(() -> new ItemStack(CHISELED_END_STONE)).entries((displayContext, entries) -> {

                        entries.add(CHISELED_END_STONE);
                        entries.add(POLISHED_END_STONE);
                        entries.add(POLISHED_END_STONE_STAIRS);
                        entries.add(POLISHED_END_STONE_SLAB);
                        entries.add(END_STONE_TILES);
                        entries.add(END_STONE_TILES_STAIRS);
                        entries.add(END_STONE_TILES_SLAB);
                        entries.add(END_STONE_TILES_WALL);
                    }).build());

    public static void registerItemGroups() {
        EndAdditions.LOGGER.info("Registering item groups for " + EndAdditions.MOD_ID + ".");
    }
}
