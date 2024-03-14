package org.flenarn;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.flenarn.datagen.EndAdditionsBlockLootTableProvider;
import org.flenarn.datagen.EndAdditionsBlockTagProvider;
import org.flenarn.datagen.EndAdditionsModelProvider;

public class EndAdditionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EndAdditionsBlockLootTableProvider::new);
		pack.addProvider(EndAdditionsBlockTagProvider::new);
		pack.addProvider(EndAdditionsModelProvider::new);
	}
}
