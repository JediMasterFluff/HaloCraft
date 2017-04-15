package halocraft.item;

import halocraft.item.tools.HaloAxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBase hardenedDiamond;
	public static HaloAxe hardendedDiamondAxe;

	public static void init() {
		hardenedDiamond = register(new ItemBase("hardenedDiamond"));
		hardendedDiamondAxe = register(new HaloAxe(ToolMaterial.DIAMOND, "hardenedDiamondAxe"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}

		return item;
	}
}
