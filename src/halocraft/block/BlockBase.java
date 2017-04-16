package halocraft.block;

import halocraft.item.ItemModelProvider;
import halocraft.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;
	
	public static ToolMaterial haloToolMaterial = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);

	public BlockBase(Material mat, String name) {
		super(mat);
		this.name = name;
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
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
