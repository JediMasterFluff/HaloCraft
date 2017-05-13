package halocraft.item;

import halocraft.item.tools.HaloAxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	/**
	 * Tool Declaration
	 */
	
	public static ItemBase hardenedDiamond;
	public static HaloAxe hardendedDiamondAxe;

	
	/**
	 * Tool Material Declaration
	
		The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) 
	    private final int harvestLevel;
	    
	    The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) 
	    private final int maxUses;
	    
	    The strength of this tool material against blocks which it is effective against. 
	    private final float efficiencyOnProperMaterial;
	   	
	   	Damage versus entities. 
	    private final float damageVsEntity;
	    
	    Defines the natural enchantability factor of the material. 
	    private final int enchantability;
	    
        WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
    */
	public static ToolMaterial plasma_ToolMaterial = EnumHelper.addToolMaterial("Plasma", 0, 100, 0.0f, 15.0f, 5);
	public static ToolMaterial hardendedDiamond_ToolMaterial = EnumHelper.addToolMaterial("Hardened Diamond", 3, 3000, 10.0f, 4.0f, 10);
	
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
