package halocraft.main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy {

	public void preInit(FMLPreInitializationEvent e) {
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		// event.getRegistry().registerAll(event);
	}

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(Main.MODID + ":" + id, "inventory"));
	}
}
