package fr.noahboos.saphir.items.definitions.materials.tool;

import fr.noahboos.saphir.tags.SaphirBlockTagProvider;
import fr.noahboos.saphir.tags.SaphirItemTagProvider;
import net.minecraft.world.item.ToolMaterial;

public class BlueSapphireToolMaterial {
    public static final int DURABILITY = 1796;
    public static final float SPEED = 8.5f;
    public static final float ATTACK_DAMAGE_BONUS = 3.5f;
    public static final int ENCHANTMENT_VALUE = 15;

    public static final ToolMaterial INSTANCE = new ToolMaterial(
        SaphirBlockTagProvider.INCORRECT_FOR_BLUE_SAPPHIRE_TOOL,
        DURABILITY,
        SPEED,
        ATTACK_DAMAGE_BONUS,
        ENCHANTMENT_VALUE,
        SaphirItemTagProvider.REPAIRS_BLUE_SAPPHIRE_ARMOR
    );
}
