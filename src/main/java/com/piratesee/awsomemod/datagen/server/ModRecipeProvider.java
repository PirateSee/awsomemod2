package com.piratesee.awsomemod.datagen.server;

import java.util.function.Consumer;

import com.piratesee.awsomemod.AwsomeMod;
import com.piratesee.awsomemod.init.BlockInit;
import com.piratesee.awsomemod.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;

public class ModRecipeProvider extends RecipeProvider {

	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(ItemInit.THE_THING.get())
		.define('a', BlockInit.PROTOTYPE.get().asItem())
		.pattern("aa").pattern("aa")
		.save(consumer, new ResourceLocation(AwsomeMod.MOD_ID, "yes"));
	}
	
}
