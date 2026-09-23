package fr.noahboos.saphir.items;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.items.definitions.materials.armor.BlueSapphireArmorMaterial;
import fr.noahboos.saphir.items.definitions.materials.tool.BlueSapphireToolMaterial;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class SaphirItems {
    public static void initialize() {
        Saphir.LOGGER.info("Initializing {}'s items.", Saphir.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE_SHOVEL);
            creativeModeTab.accept(BLUE_SAPPHIRE_PICKAXE);
            creativeModeTab.accept(BLUE_SAPPHIRE_AXE);
            creativeModeTab.accept(BLUE_SAPPHIRE_HOE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE_HELMET);
            creativeModeTab.accept(BLUE_SAPPHIRE_CHESTPLATE);
            creativeModeTab.accept(BLUE_SAPPHIRE_LEGGINGS);
            creativeModeTab.accept(BLUE_SAPPHIRE_BOOTS);
            creativeModeTab.accept(BLUE_SAPPHIRE_SWORD);
            creativeModeTab.accept(BLUE_SAPPHIRE_SPEAR);
            creativeModeTab.accept(BLUE_SAPPHIRE_AXE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE);
        });
        Saphir.LOGGER.info("Initialized {}'s items.", Saphir.MOD_ID);
    }

    public static Item register(ResourceKey<Item> itemResourceKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemResourceKey));

        Registry.register(BuiltInRegistries.ITEM, itemResourceKey, item);

        return item;
    }

    public static final Item BLUE_SAPPHIRE = register(
        SaphirItemIds.BLUE_SAPPHIRE,
        Item::new,
        new Item.Properties()
    );

    public static final Item BLUE_SAPPHIRE_HELMET = register(
        SaphirItemIds.BLUE_SAPPHIRE_HELMET,
        Item::new,
        new Item.Properties()
            .humanoidArmor(BlueSapphireArmorMaterial.INSTANCE, ArmorType.HELMET)
            .durability(ArmorType.HELMET.getDurability(BlueSapphireArmorMaterial.BASE_DURABILITY))
    );

    public static final Item BLUE_SAPPHIRE_CHESTPLATE = register(
        SaphirItemIds.BLUE_SAPPHIRE_CHESTPLATE,
        Item::new,
        new Item.Properties()
            .humanoidArmor(BlueSapphireArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
            .durability(ArmorType.CHESTPLATE.getDurability(BlueSapphireArmorMaterial.BASE_DURABILITY))
    );

    public static final Item BLUE_SAPPHIRE_LEGGINGS = register(
        SaphirItemIds.BLUE_SAPPHIRE_LEGGINGS,
        Item::new,
        new Item.Properties()
            .humanoidArmor(BlueSapphireArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
            .durability(ArmorType.LEGGINGS.getDurability(BlueSapphireArmorMaterial.BASE_DURABILITY))
    );

    public static final Item BLUE_SAPPHIRE_BOOTS = register(
        SaphirItemIds.BLUE_SAPPHIRE_BOOTS,
        Item::new,
        new Item.Properties()
            .humanoidArmor(BlueSapphireArmorMaterial.INSTANCE, ArmorType.BOOTS)
            .durability(ArmorType.BOOTS.getDurability(BlueSapphireArmorMaterial.BASE_DURABILITY))
    );

    public static final Item BLUE_SAPPHIRE_SWORD = register(
        SaphirItemIds.BLUE_SAPPHIRE_SWORD,
        Item::new,
        new Item.Properties()
            .sword(BlueSapphireToolMaterial.INSTANCE, 3.0f, -2.4f)
    );

    public static final Item BLUE_SAPPHIRE_SPEAR = register(
        SaphirItemIds.BLUE_SAPPHIRE_SPEAR,
        Item::new,
        new Item.Properties()
            .spear(BlueSapphireToolMaterial.INSTANCE, 1.10f, 1.1375f, 0.45f, 2.75f, 9.5f, 6.0f, 5.1f, 9.375f, 4.6f)
    );

    public static final Item BLUE_SAPPHIRE_PICKAXE = register(
        SaphirItemIds.BLUE_SAPPHIRE_PICKAXE,
        Item::new,
        new Item.Properties()
            .pickaxe(BlueSapphireToolMaterial.INSTANCE, 1.0f, -2.8f)
    );

    public static final Item BLUE_SAPPHIRE_AXE = register(
        SaphirItemIds.BLUE_SAPPHIRE_AXE,
        settings -> new AxeItem(BlueSapphireToolMaterial.INSTANCE, 5.0f, -3.0f, settings),
        new Item.Properties()
    );

    public static final Item BLUE_SAPPHIRE_SHOVEL = register(
        SaphirItemIds.BLUE_SAPPHIRE_SHOVEL,
        settings -> new ShovelItem(BlueSapphireToolMaterial.INSTANCE, 1.5f, -3.0f, settings),
        new Item.Properties()
    );

    public static final Item BLUE_SAPPHIRE_HOE = register(
        SaphirItemIds.BLUE_SAPPHIRE_HOE,
        settings -> new HoeItem(BlueSapphireToolMaterial.INSTANCE, -3.0f, 0.0f, settings),
        new Item.Properties()
    );
}
