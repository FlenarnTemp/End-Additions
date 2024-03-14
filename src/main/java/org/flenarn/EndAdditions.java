package org.flenarn;

import net.fabricmc.api.ModInitializer;

import org.flenarn.blocks.EndAdditionsBlocks;
import org.flenarn.items.EndAdditionsItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndAdditions implements ModInitializer {
	public static final String MOD_ID = "end_additions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EndAdditionsBlocks.registerBlocks();
		EndAdditionsItemGroups.registerItemGroups();
	}
}