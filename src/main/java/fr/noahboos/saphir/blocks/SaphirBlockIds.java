package fr.noahboos.saphir.blocks;

import fr.noahboos.saphir.Saphir;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class SaphirBlockIds {
    public static ResourceKey<Block> create(String name) {
        Identifier identifier = Saphir.id(name);
        return ResourceKey.create(Registries.BLOCK, identifier);
    }
}
