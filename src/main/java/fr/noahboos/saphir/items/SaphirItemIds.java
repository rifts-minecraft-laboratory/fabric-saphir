package fr.noahboos.saphir.items;

import fr.noahboos.saphir.Saphir;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class SaphirItemIds {
    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Saphir.MOD_ID, name));
    }

    public static final ResourceKey<Item> BLUE_SAPPHIRE = create("blue_sapphire");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_HELMET = create("blue_sapphire_helmet");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_CHESTPLATE = create("blue_sapphire_chestplate");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_LEGGINGS = create("blue_sapphire_leggings");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_BOOTS = create("blue_sapphire_boots");
}
