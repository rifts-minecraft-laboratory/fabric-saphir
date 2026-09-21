package fr.noahboos.saphir.items;

import fr.noahboos.saphir.Saphir;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class SaphirItems {
    public static void initialize() {
        Saphir.LOGGER.info("Initializing {}'s items.", Saphir.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(creativeModeTab -> {
            creativeModeTab.accept(BLUE_SAPPHIRE);
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
}
