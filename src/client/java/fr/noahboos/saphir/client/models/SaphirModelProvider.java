package fr.noahboos.saphir.client.models;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.blocks.SaphirBlocks;
import fr.noahboos.saphir.items.SaphirItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class SaphirModelProvider extends FabricModelProvider {
    public SaphirModelProvider(FabricPackOutput fabricPackOutput) {
        super(fabricPackOutput);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        Saphir.LOGGER.info("Generating {}'s block models.", Saphir.MOD_ID);
        Saphir.LOGGER.info("Generating blue sapphire block models.");
        blockModelGenerators.createTrivialCube(SaphirBlocks.BLUE_SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(SaphirBlocks.BLUE_SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(SaphirBlocks.DEEPSLATE_BLUE_SAPPHIRE_ORE);
        Saphir.LOGGER.info("Generated blue sapphire block models.");
        Saphir.LOGGER.info("Generating orange sapphire block models.");
        blockModelGenerators.createTrivialCube(SaphirBlocks.ORANGE_SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(SaphirBlocks.ORANGE_SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(SaphirBlocks.DEEPSLATE_ORANGE_SAPPHIRE_ORE);
        Saphir.LOGGER.info("Generated orange sapphire block models.");
        Saphir.LOGGER.info("Generated {}'s block models.", Saphir.MOD_ID);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        Saphir.LOGGER.info("Generating {}'s item models.", Saphir.MOD_ID);
        Saphir.LOGGER.info("Generating blue sapphire item models.");
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_BOOTS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(SaphirItems.BLUE_SAPPHIRE_SPEAR);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        Saphir.LOGGER.info("Generated blue sapphire item models.");
        Saphir.LOGGER.info("Generating orange sapphire item models.");
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_BOOTS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateSpear(SaphirItems.ORANGE_SAPPHIRE_SPEAR);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(SaphirItems.ORANGE_SAPPHIRE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        Saphir.LOGGER.info("Generated orange sapphire item models.");
        Saphir.LOGGER.info("Generated {}'s item models.", Saphir.MOD_ID);
    }

    @Override
    public String getName() {
        return "SaphirModelProvider";
    }
}
