package com.piratesee.awsomemod.datagen.server;

import com.piratesee.awsomemod.datagen.BaseLootTableProvider;
import com.piratesee.awsomemod.init.BlockInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class ModLootTableProvider extends BaseLootTableProvider {

	public ModLootTableProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void addTables() {
		dropSelf(BlockInit.PROTOTYPE.get());
		
	}
	
	protected void dropSelf(Block block) {
		add(block, createSimpleTable(ForgeRegistries.BLOCKS.getKey(block).getPath(), block));
	}
	
}
