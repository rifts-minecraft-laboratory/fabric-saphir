package fr.noahboos.saphir.worldgen.features.configured;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.worldgen.features.configured.definitions.OreConfiguredFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class SaphirConfiguredFeatures {
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        OreConfiguredFeatures.bootstrap(context);
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> register(String name) {
        return ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(Saphir.MOD_ID, name)
        );
    }
}
