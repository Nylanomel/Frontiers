package com.nylanomel.frontiers.util;


import com.nylanomel.frontiers.Frontiers;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHandler {

    public static final Block SKYSTONE = new Block(FabricBlockSettings.of(Material.STONE));

    public static void registerItems(){
        Registry.register(Registry.BLOCK, new Identifier(Frontiers.MOD_ID, "skystone"), SKYSTONE);
        Registry.register(Registry.ITEM, new Identifier(Frontiers.MOD_ID, "skystone"), new BlockItem(SKYSTONE, new Item.Settings().group(Frontiers.ITEM_GROUP)));
    }
}
