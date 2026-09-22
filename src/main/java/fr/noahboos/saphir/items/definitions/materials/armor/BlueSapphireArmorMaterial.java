package fr.noahboos.saphir.items.definitions.materials.armor;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.tags.SaphirItemTagProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class BlueSapphireArmorMaterial {
    public static final int BASE_DURABILITY = 35;
    public static final int ENCHANTMENT_VALUE = 15;
    public static final float TOUGHNESS = 2.5f;
    public static final float KNOCKBACK_RESISTANCE = 0.0f;

    public static final ResourceKey<EquipmentAsset> BLUE_SAPPHIRE_ARMOR_MATERIAL_KEY = ResourceKey.create(
        EquipmentAssets.ROOT_ID,
        Saphir.id("blue_sapphire")
    );

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
        BASE_DURABILITY,
        Map.of(
            ArmorType.HELMET, 3,
            ArmorType.CHESTPLATE, 8,
            ArmorType.LEGGINGS, 6,
            ArmorType.BOOTS, 3,
            ArmorType.BODY, 11
        ),
        ENCHANTMENT_VALUE,
        SoundEvents.ARMOR_EQUIP_DIAMOND,
        TOUGHNESS,
        KNOCKBACK_RESISTANCE,
        SaphirItemTagProvider.REPAIRS_BLUE_SAPPHIRE_ARMOR,
        BLUE_SAPPHIRE_ARMOR_MATERIAL_KEY
    );
}
