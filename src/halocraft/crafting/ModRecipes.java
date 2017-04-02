package halocraft.crafting;

import halocraft.block.ModBlocks;
import halocraft.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void addRecipes(){
		//shaped crafting
		GameRegistry.addRecipe(new ItemStack(ModItems.hardendedDiamondAxe, 1), "dd ", "ds ", " s ", 'd', ModItems.hardenedDiamond, 's', Items.STICK);
		
		//shapeless crafting
		
		
		//smelting crafting
		GameRegistry.addSmelting(ModBlocks.oreHardenedDiamond, new ItemStack(ModItems.hardenedDiamond), 3f);
	}
}
