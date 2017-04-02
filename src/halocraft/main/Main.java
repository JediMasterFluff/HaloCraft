package halocraft.main;

import halocraft.block.ModBlocks;
import halocraft.crafting.ModRecipes;
import halocraft.item.ModItems;
import halocraft.main.client.HaloCraftTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name=Main.MODNAME, version=Main.VERSION)

public class Main {
	
    public static final String MODID = "halo_craft";
    public static final String MODNAME = "HaloCraft";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide="com.halocraft.main.ClientProxy", serverSide="com.halocraft.main.ServerProxy")
    public static ClientProxy proxy;

    @Instance
    public static Main instance = new Main();
    
    public static final HaloCraftTab tab = new HaloCraftTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);
    	System.out.println("Called method: HaloCraft = PREINIT");
    	ModItems.init();
		ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e);
    	ModRecipes.addRecipes();
   
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }

}
