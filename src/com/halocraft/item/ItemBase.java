package com.halocraft.item;

import com.halocraft.main.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ItemBase extends Item implements ItemModelProvider {

	private String name;
	
	public ItemBase(String name){
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tabs){
		super.setCreativeTab(tabs);
		return this;
	}
	
}
