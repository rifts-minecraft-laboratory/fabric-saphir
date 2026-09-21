package fr.noahboos.saphir.client.datagen;

import fr.noahboos.saphir.Saphir;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SaphirDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Saphir.LOGGER.info("Initializing {}'s datagen.", Saphir.MOD_ID);
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(SaphirModelProvider::new);
		Saphir.LOGGER.info("Initialized {}'s datagen.", Saphir.MOD_ID);
	}
}
