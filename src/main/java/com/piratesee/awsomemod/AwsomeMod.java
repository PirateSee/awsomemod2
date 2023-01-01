package com.piratesee.awsomemod;

import com.piratesee.awsomemod.init.BlockInit;
import com.piratesee.awsomemod.init.ItemInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("awsomemod")
public class AwsomeMod {

	public static final String MOD_ID = "awsomemod";
	
	
	
	public AwsomeMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
