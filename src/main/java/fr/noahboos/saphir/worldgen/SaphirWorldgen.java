package fr.noahboos.saphir.worldgen;

import fr.noahboos.saphir.worldgen.features.placed.definitions.OrePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class SaphirWorldgen {
    public static void initialize() {
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.EXTRA_SMALL_SAPPHIRE_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.SMALL_SAPPHIRE_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.MEDIUM_SAPPHIRE_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.LARGE_SAPPHIRE_VEIN_PLACED_KEY
        );

        BiomeModifications.addFeature(
            BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
            GenerationStep.Decoration.UNDERGROUND_ORES,
            OrePlacedFeatures.EXTRA_LARGE_SAPPHIRE_VEIN_PLACED_KEY
        );
    }
}
