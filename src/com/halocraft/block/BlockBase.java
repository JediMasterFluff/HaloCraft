package com.halocraft.block;

import com.halocraft.item.ItemModelProvider;
import com.halocraft.main.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;
	
	public BlockBase(Material mat, String name){
		super(mat);
		this.name= name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(item, 0, name);
		
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab){
		super.setCreativeTab(tab);
		return this;
	}

}
