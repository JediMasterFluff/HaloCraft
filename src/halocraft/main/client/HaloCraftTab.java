package halocraft.main.client;

import halocraft.item.ModItems;
import halocraft.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HaloCraftTab extends CreativeTabs{
	
	public HaloCraftTab(){
		super(Main.MODID);
		//setBackgroundImageName("hardenedDiamond.png");
	}
	
	@Override
	public ItemStack getTabIconItem(){
		return new ItemStack(ModItems.hardenedDiamond);
	}
	
	@Override
	public boolean hasSearchBar(){
		return true;
	}

}
