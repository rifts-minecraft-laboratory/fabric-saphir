package fr.noahboos.saphir.blocks;

import fr.noahboos.saphir.Saphir;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class SaphirBlocks {
    public static void initialize() {
        Saphir.LOGGER.info("Initializing {}'s blocks.", Saphir.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(creativeModeTab -> {
            creativeModeTab.accept(SaphirBlocks.BLUE_SAPPHIRE_BLOCK.asItem());
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(creativeModeTab -> {
            creativeModeTab.accept(SaphirBlocks.BLUE_SAPPHIRE_ORE.asItem());
            creativeModeTab.accept(SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE.asItem());
        });
        Saphir.LOGGER.info("Initialized {}'s blocks.", Saphir.MOD_ID);
    }

    public static Block register(BlockItemId blockItemId, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = register(blockItemId.block(), blockFactory, properties);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(blockItemId.item()));
        Registry.register(BuiltInRegistries.ITEM, blockItemId.item(), blockItem);

        return block;
    }

    public static Block register(ResourceKey<Block> resourceKey, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = blockFactory.apply(properties.setId(resourceKey));

        return Registry.register(BuiltInRegistries.BLOCK, resourceKey, block);
    }

    public static final Block BLUE_SAPPHIRE_BLOCK = register(
        SaphirBlockItemIds.BLUE_SAPPHIRE_BLOCK,
        Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.METAL)
    );

    public static final Block BLUE_SAPPHIRE_ORE = register(
        SaphirBlockItemIds.BLUE_SAPPHIRE_ORE,
        Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.STONE)
    );

    public static final Block DEEPSLATE_BLUE_SAPPHIRE_ORE = register(
        SaphirBlockItemIds.DEEPSLATE_BLUE_SAPPHIRE_ORE,
        Block::new,
        BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE)
    );
}
