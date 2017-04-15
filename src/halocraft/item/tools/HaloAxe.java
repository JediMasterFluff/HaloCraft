package halocraft.item.tools;

import halocraft.item.ItemModelProvider;
import halocraft.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class HaloAxe extends ItemAxe implements ItemModelProvider {

	protected String name;

	public HaloAxe(ToolMaterial material, String name) {
		super(material);
		// TODO Auto-generated constructor stub

		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tab);
	}

	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	public HaloAxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
