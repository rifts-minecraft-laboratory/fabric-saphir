package fr.noahboos.saphir.trims;

import fr.noahboos.saphir.Saphir;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.TrimMaterial;

public class SaphirTrimMaterials {
    public static final ResourceKey<TrimMaterial> BLUE_SAPPHIRE_TRIM_MATERIAL = ResourceKey.create(
        Registries.TRIM_MATERIAL,
        Saphir.id("blue_sapphire")
    );
}
