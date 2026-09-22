package fr.noahboos.saphir.client;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.client.loottables.SaphirBlockLootTableProvider;
import fr.noahboos.saphir.client.models.SaphirModelProvider;
import fr.noahboos.saphir.tags.SaphirBlockTagProvider;
import fr.noahboos.saphir.tags.SaphirItemTagProvider;
import fr.noahboos.saphir.worldgen.features.configured.SaphirConfiguredFeatures;
import fr.noahboos.saphir.worldgen.features.placed.SaphirPlacedFeatures;
import fr.noahboos.saphir.worldgen.SaphirWorldgenProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class SaphirDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		Saphir.LOGGER.info("Initializing {}'s datagen.", Saphir.MOD_ID);
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(SaphirBlockLootTableProvider::new);
		pack.addProvider(SaphirBlockTagProvider::new);
		pack.addProvider(SaphirItemTagProvider::new);
		pack.addProvider(SaphirModelProvider::new);
		pack.addProvider(SaphirWorldgenProvider::new);
		Saphir.LOGGER.info("Initialized {}'s datagen.", Saphir.MOD_ID);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
		registrySetBuilder.add(Registries.CONFIGURED_FEATURE, SaphirConfiguredFeatures::bootstrap);
		registrySetBuilder.add(Registries.PLACED_FEATURE, SaphirPlacedFeatures::bootstrap);
	}
}
