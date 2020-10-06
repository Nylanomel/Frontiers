package com.nylanomel.frontiers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Frontiers implements ModInitializer {

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("frontiers", "general"),
			() -> new ItemStack(Blocks.COBBLESTONE));

	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
			new Identifier("frontiers", "other"))
			.icon(() -> new ItemStack(Items.BOWL))
			.build();

	public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(Frontiers.ITEM_GROUP));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("frontiers", "fabric_item"), FABRIC_ITEM);
	}
}
