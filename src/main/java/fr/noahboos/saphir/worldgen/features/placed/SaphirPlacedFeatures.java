package fr.noahboos.saphir.worldgen.features.placed;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.worldgen.features.placed.definitions.OrePlacedFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.*;

public class SaphirPlacedFeatures {
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        OrePlacedFeatures.bootstrap(context);
    }

    public static ResourceKey<PlacedFeature> register(String name) {
        return ResourceKey.create(
            Registries.PLACED_FEATURE,
            Identifier.fromNamespaceAndPath(Saphir.MOD_ID, name)
        );
    }
}
