package fr.noahboos.saphir.client.loottables;

import fr.noahboos.saphir.blocks.SaphirBlocks;
import fr.noahboos.saphir.items.SaphirItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class SaphirBlockLootTableProvider extends FabricBlockLootSubProvider {
    public SaphirBlockLootTableProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(SaphirBlocks.BLUE_SAPPHIRE_BLOCK);
        dropWhenSilkTouch(SaphirBlocks.BLUE_SAPPHIRE_ORE);
        add(SaphirBlocks.BLUE_SAPPHIRE_ORE, createOreDrop(SaphirBlocks.BLUE_SAPPHIRE_ORE, SaphirItems.BLUE_SAPPHIRE));
        dropWhenSilkTouch(SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE);
        add(SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE, createOreDrop(SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE, SaphirItems.BLUE_SAPPHIRE));
    }
}
