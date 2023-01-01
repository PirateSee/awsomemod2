package com.piratesee.awsomemod.datagen.server;

import com.piratesee.awsomemod.AwsomeMod;
import com.piratesee.awsomemod.init.BlockInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

	public ModBlockTagsProvider(DataGenerator p_126511_, ExistingFileHelper helper) {
		super(p_126511_, AwsomeMod.MOD_ID, helper);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void addTags() {
		tag(Tags.Blocks.NEEDS_WOOD_TOOL).add(BlockInit.PROTOTYPE.get());
	}

}
