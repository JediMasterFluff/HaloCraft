package com.halocraft.block;

import com.halocraft.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockBase oreHardenedDiamond;

	public static void init(){
		oreHardenedDiamond = register(new BlockOre("hardenedDiamondOre"));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemblock){
		GameRegistry.register(block);
		if(itemblock instanceof ItemModelProvider){
			((ItemModelProvider)itemblock).registerItemModel(itemblock);
		}
		
		if(block instanceof ItemModelProvider){
			((ItemModelProvider)block).registerItemModel(itemblock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block){
		ItemBlock itemblock = new ItemBlock(block);
		itemblock.setRegistryName(block.getRegistryName());
		return register(block, itemblock);
	}
}
