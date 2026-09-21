package fr.noahboos.saphir.blocks;

import fr.noahboos.saphir.Saphir;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class SaphirBlockItemIds {
    public static BlockItemId create(String name) {
        Identifier identifier = Saphir.id(name);
        return BlockItemId.create(identifier, identifier);
    }

    public static final BlockItemId BLUE_SAPPHIRE_BLOCK = create("blue_sapphire_block");
    public static final BlockItemId BLUE_SAPPHIRE_ORE = create("blue_sapphire_ore");
    public static final BlockItemId DEEPSLATE_BLUE_SAPPHIRE_ORE = create("deepslate_blue_sapphire_ore");
}
