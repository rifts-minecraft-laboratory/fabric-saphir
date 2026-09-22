package fr.noahboos.saphir.items;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.items.definitions.materials.armor.BlueSapphireArmorMaterial;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class SaphirItems {
    public static void initialize() {
        Saphir.LOGGER.info("Initializing {}'s items.", Saphir.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE_HELMET);
            creativeModeTab.accept(BLUE_SAPPHIRE_CHESTPLATE);
            creativeModeTab.accept(BLUE_SAPPHIRE_LEGGINGS);
            creativeModeTab.accept(BLUE_SAPPHIRE_BOOTS);
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
}
