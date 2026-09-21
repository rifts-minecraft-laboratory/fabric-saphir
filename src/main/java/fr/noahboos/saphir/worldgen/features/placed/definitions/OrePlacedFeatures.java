package fr.noahboos.saphir.worldgen.features.placed.definitions;

import fr.noahboos.saphir.worldgen.features.configured.definitions.OreConfiguredFeatures;
import fr.noahboos.saphir.worldgen.features.placed.SaphirPlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlacedFeatures {
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        List<PlacementModifier> oreSapphireVeinModifiers = List.of(
            CountPlacement.of(200),
            BiomeFilter.biome(),
            InSquarePlacement.spread(),
            HeightRangePlacement.of(
                BiasedToBottomHeight.of(
                    VerticalAnchor.BOTTOM,
                    VerticalAnchor.absolute(16),
                    4
                )
            )
        );

        context.register(EXTRA_SMALL_SAPPHIRE_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.EXTRA_SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY),
            oreSapphireVeinModifiers
        ));

        context.register(SMALL_SAPPHIRE_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.SMALL_SAPPHIRE_VEIN_CONFIGURED_KEY),
            oreSapphireVeinModifiers
        ));

        context.register(MEDIUM_SAPPHIRE_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.MEDIUM_SAPPHIRE_VEIN_CONFIGURED_KEY),
            oreSapphireVeinModifiers
        ));

        context.register(LARGE_SAPPHIRE_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY),
            oreSapphireVeinModifiers
        ));

        context.register(EXTRA_LARGE_SAPPHIRE_VEIN_PLACED_KEY, new PlacedFeature(
            configuredFeatureHolderGetter.getOrThrow(OreConfiguredFeatures.EXTRA_LARGE_SAPPHIRE_VEIN_CONFIGURED_KEY),
            oreSapphireVeinModifiers
        ));
    }

    public static final ResourceKey<PlacedFeature> EXTRA_SMALL_SAPPHIRE_VEIN_PLACED_KEY = SaphirPlacedFeatures.register("extra_small_sapphire_vein_placed_key");
    public static final ResourceKey<PlacedFeature> SMALL_SAPPHIRE_VEIN_PLACED_KEY = SaphirPlacedFeatures.register("small_sapphire_vein_placed_key");
    public static final ResourceKey<PlacedFeature> MEDIUM_SAPPHIRE_VEIN_PLACED_KEY = SaphirPlacedFeatures.register("medium_sapphire_vein_placed_key");
    public static final ResourceKey<PlacedFeature> LARGE_SAPPHIRE_VEIN_PLACED_KEY = SaphirPlacedFeatures.register("large_sapphire_vein_placed_key");
    public static final ResourceKey<PlacedFeature> EXTRA_LARGE_SAPPHIRE_VEIN_PLACED_KEY = SaphirPlacedFeatures.register("extra_large_sapphire_vein_placed_key");
}
