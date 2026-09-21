package fr.noahboos.saphir.client.datagen;

import fr.noahboos.saphir.Saphir;
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
        //
        Saphir.LOGGER.info("Generated {}'s block models.", Saphir.MOD_ID);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        Saphir.LOGGER.info("Generating {}'s item models.", Saphir.MOD_ID);
        itemModelGenerators.generateFlatItem(SaphirItems.BLUE_SAPPHIRE, ModelTemplates.FLAT_ITEM);
        Saphir.LOGGER.info("Generated {}'s item models.", Saphir.MOD_ID);
    }

    @Override
    public String getName() {
        return "SaphirModelProvider";
    }
}
