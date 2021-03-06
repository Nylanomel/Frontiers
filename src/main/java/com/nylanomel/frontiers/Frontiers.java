package com.nylanomel.frontiers;

import com.nylanomel.frontiers.util.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Frontiers implements ModInitializer {

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("frontiers", "general"), () -> new ItemStack(Blocks.COBBLESTONE));
	public static final String MOD_ID = "frontiers";

	@Override
	public void onInitialize() {
		RegistryHandler.registerItems();
	}
}
