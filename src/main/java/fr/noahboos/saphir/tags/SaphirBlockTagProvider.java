package fr.noahboos.saphir.tags;

import fr.noahboos.saphir.blocks.SaphirBlockItemIds;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class SaphirBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public SaphirBlockTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(SaphirBlockItemIds.BLUE_SAPPHIRE_BLOCK)
            .add(SaphirBlockItemIds.BLUE_SAPPHIRE_ORE)
            .add(SaphirBlockItemIds.DEEPSLATE_BLUE_SAPPHIRE_ORE);

        builder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(SaphirBlockItemIds.BLUE_SAPPHIRE_BLOCK)
            .add(SaphirBlockItemIds.BLUE_SAPPHIRE_ORE)
            .add(SaphirBlockItemIds.DEEPSLATE_BLUE_SAPPHIRE_ORE);
    }
}
