package com.piratesee.awsomemod.datagen;

import com.piratesee.awsomemod.AwsomeMod;
import com.piratesee.awsomemod.datagen.client.ModBlockStateProvider;
import com.piratesee.awsomemod.datagen.client.ModItemModelProvider;
import com.piratesee.awsomemod.datagen.server.ModBlockTagsProvider;
import com.piratesee.awsomemod.datagen.server.ModItemTagsProvider;
import com.piratesee.awsomemod.datagen.server.ModLootTableProvider;
import com.piratesee.awsomemod.datagen.server.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AwsomeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
	private DataGeneration() {}
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();
		
		generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, helper));
		generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, helper));
		
		generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
		
		ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);
		
		generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
		generator.addProvider(event.includeServer(), blockTags);
		generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, blockTags, helper));
		generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
		
		
		
	}
}
