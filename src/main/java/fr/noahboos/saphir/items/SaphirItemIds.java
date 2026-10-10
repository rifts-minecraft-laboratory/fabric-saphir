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
    public static final ResourceKey<Item> BLUE_SAPPHIRE_SWORD = create("blue_sapphire_sword");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_SPEAR = create("blue_sapphire_spear");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_PICKAXE = create("blue_sapphire_pickaxe");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_AXE = create("blue_sapphire_axe");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_SHOVEL = create("blue_sapphire_shovel");
    public static final ResourceKey<Item> BLUE_SAPPHIRE_HOE = create("blue_sapphire_hoe");

    public static final ResourceKey<Item> ORANGE_SAPPHIRE = create("orange_sapphire");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_HELMET = create("orange_sapphire_helmet");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_CHESTPLATE = create("orange_sapphire_chestplate");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_LEGGINGS = create("orange_sapphire_leggings");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_BOOTS = create("orange_sapphire_boots");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_SWORD = create("orange_sapphire_sword");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_SPEAR = create("orange_sapphire_spear");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_PICKAXE = create("orange_sapphire_pickaxe");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_AXE = create("orange_sapphire_axe");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_SHOVEL = create("orange_sapphire_shovel");
    public static final ResourceKey<Item> ORANGE_SAPPHIRE_HOE = create("orange_sapphire_hoe");
}
