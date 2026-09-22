package fr.noahboos.saphir.tags;

import fr.noahboos.saphir.Saphir;
import fr.noahboos.saphir.items.SaphirItemIds;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.concurrent.CompletableFuture;

public class SaphirItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public SaphirItemTagProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    public static final TagKey<Item> REPAIRS_BLUE_SAPPHIRE_ARMOR = TagKey.create(
        Registries.ITEM,
        Saphir.id("repairs_blue_sapphire_armor")
    );

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        builder(REPAIRS_BLUE_SAPPHIRE_ARMOR)
            .add(SaphirItemIds.BLUE_SAPPHIRE);

        builder(ItemTags.HEAD_ARMOR)
            .add(SaphirItemIds.BLUE_SAPPHIRE_HELMET);

        builder(ItemTags.CHEST_ARMOR)
            .add(SaphirItemIds.BLUE_SAPPHIRE_CHESTPLATE);

        builder(ItemTags.LEG_ARMOR)
            .add(SaphirItemIds.BLUE_SAPPHIRE_LEGGINGS);

        builder(ItemTags.FOOT_ARMOR)
            .add(SaphirItemIds.BLUE_SAPPHIRE_BOOTS);
    }
}
