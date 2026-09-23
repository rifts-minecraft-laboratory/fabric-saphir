package fr.noahboos.saphir.tags;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.blocks.SaphirBlockItemIds;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class SaphirBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public SaphirBlockTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    public static final TagKey<Block> INCORRECT_FOR_BLUE_SAPPHIRE_TOOL = TagKey.create(
        Registries.BLOCK,
        Saphir.id("incorrect_for_blue_sapphire_tool")
    );

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(INCORRECT_FOR_BLUE_SAPPHIRE_TOOL)
            .addOptionalTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

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
