package fr.noahboos.saphir.blocks;

import fr.noahboos.saphir.Saphir;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class SaphirBlockItemIds {
    public static BlockItemId create(String name) {
        Identifier identifier = Saphir.id(name);
        return BlockItemId.create(identifier, identifier);
    }
}
