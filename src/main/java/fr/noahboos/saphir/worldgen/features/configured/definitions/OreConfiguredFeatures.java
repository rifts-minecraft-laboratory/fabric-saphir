package fr.noahboos.saphir.worldgen.features.configured.definitions;

import fr.noahboos.saphir.blocks.SaphirBlocks;
import fr.noahboos.saphir.worldgen.features.configured.SaphirConfiguredFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class OreConfiguredFeatures {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceableRule = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceableRule = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> oreSapphireTargetList = List.of(
            OreConfiguration.target(stoneReplaceableRule, SaphirBlocks.BLUE_SAPPHIRE_ORE.defaultBlockState()),
            OreConfiguration.target(deepslateReplaceableRule, SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE.defaultBlockState())
        );

        context.register(EXTRA_SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreSapphireTargetList, 1)));
        context.register(SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreSapphireTargetList, 2)));
        context.register(MEDIUM_SAPPHIRE_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreSapphireTargetList, 4, 0.25f)));
        context.register(LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreSapphireTargetList, 6, 0.75f)));
        context.register(EXTRA_LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY, new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(oreSapphireTargetList, 8, 0.95f)));
    }

    public static final ResourceKey<ConfiguredFeature<?, ?>> EXTRA_SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY = SaphirConfiguredFeatures.register("extra_small_sapphire_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY = SaphirConfiguredFeatures.register("small_sapphire_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MEDIUM_SAPPHIRE_VEIN_CONFIGURED_KEY = SaphirConfiguredFeatures.register("medium_sapphire_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY = SaphirConfiguredFeatures.register("large_sapphire_vein_configured_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EXTRA_LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY = SaphirConfiguredFeatures.register("extra_large_sapphire_vein_configured_key");
}
