package com.piratesee.awsomemod.datagen.server;

import com.piratesee.awsomemod.AwsomeMod;
import com.piratesee.awsomemod.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blocks, ExistingFileHelper helper) {
		super(generator, blocks, AwsomeMod.MOD_ID, helper);
	}

	@Override
	protected void addTags() {
		tag(Tags.Items.INGOTS).add(ItemInit.THE_THING.get());
	}
	
}
