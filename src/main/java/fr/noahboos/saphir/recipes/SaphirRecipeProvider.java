package fr.noahboos.saphir.recipes;

import fr.noahboos.saphir.blocks.SaphirBlocks;
import fr.noahboos.saphir.items.SaphirItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class SaphirRecipeProvider extends FabricRecipeProvider {
    public SaphirRecipeProvider(FabricPackOutput fabricPackOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(fabricPackOutput, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput recipeOutput) {
        return new RecipeProvider(registryLookup, recipeOutput) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.BUILDING_BLOCKS, SaphirBlocks.BLUE_SAPPHIRE_BLOCK, 1)
                    .pattern("aaa")
                    .pattern("aaa")
                    .pattern("aaa")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shapeless(RecipeCategory.MISC, SaphirItems.BLUE_SAPPHIRE, 9)
                    .requires(SaphirBlocks.BLUE_SAPPHIRE_BLOCK)
                    .unlockedBy("has_blue_sapphire_block", has(SaphirBlocks.BLUE_SAPPHIRE_BLOCK))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_HELMET, 1)
                    .pattern("aaa")
                    .pattern("a a")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_CHESTPLATE, 1)
                    .pattern("a a")
                    .pattern("aaa")
                    .pattern("aaa")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_LEGGINGS, 1)
                    .pattern("aaa")
                    .pattern("a a")
                    .pattern("a a")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_BOOTS, 1)
                    .pattern("a a")
                    .pattern("a a")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_SWORD, 1)
                    .pattern("a")
                    .pattern("a")
                    .pattern("b")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.COMBAT, SaphirItems.BLUE_SAPPHIRE_SPEAR, 1)
                    .pattern("  a")
                    .pattern(" b ")
                    .pattern("b  ")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.TOOLS, SaphirItems.BLUE_SAPPHIRE_PICKAXE, 1)
                    .pattern("aaa")
                    .pattern(" b ")
                    .pattern(" b ")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.TOOLS, SaphirItems.BLUE_SAPPHIRE_AXE, 1)
                    .pattern("aa")
                    .pattern("ba")
                    .pattern("b ")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.TOOLS, SaphirItems.BLUE_SAPPHIRE_SHOVEL, 1)
                    .pattern("a")
                    .pattern("b")
                    .pattern("b")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);

                shaped(RecipeCategory.TOOLS, SaphirItems.BLUE_SAPPHIRE_HOE, 1)
                    .pattern("aa")
                    .pattern("b ")
                    .pattern("b ")
                    .define('a', SaphirItems.BLUE_SAPPHIRE)
                    .define('b', Items.STICK)
                    .unlockedBy("has_blue_sapphire", has(SaphirItems.BLUE_SAPPHIRE))
                    .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "SaphirRecipeProvider";
    }
}
