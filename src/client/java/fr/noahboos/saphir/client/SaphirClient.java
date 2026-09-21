package fr.noahboos.saphir.client;

import fr.noahboos.saphir.Saphir;
import net.fabricmc.api.ClientModInitializer;

public class SaphirClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Saphir.LOGGER.info("Initializing {} on the client side.", Saphir.MOD_ID);
		//
		Saphir.LOGGER.info("Initialized {} on the client side.", Saphir.MOD_ID);
	}
}