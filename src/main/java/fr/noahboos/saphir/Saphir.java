package fr.noahboos.saphir;

import fr.noahboos.saphir.blocks.SaphirBlocks;
import fr.noahboos.saphir.items.SaphirItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Saphir implements ModInitializer {
	public static final String MOD_ID = "saphir";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing {} on the server side.", MOD_ID);
		SaphirBlocks.initialize();
		SaphirItems.initialize();
		LOGGER.info("Initialized {} on the server side.", MOD_ID);
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
