package enderpower.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.SidedProxy;
import enderpower.Blocks.EnderpowerBlocks;
import enderpower.Items.EnderpowerItems;
import enderpower.Items.RegisterMobDrops;
import enderpower.Tabs.EnderpowerSietab;
import enderpower.Tabs.Enderpowertab;
import enderpower.lib.R;
import enderpower.mobs.EntityEnderhunter;
import enderpower.mobs.EntityHandler;
import enderpower.recipes.EnderpowerSmeltingRecipes;
import enderpower.tools.ToolRegistratie;
import enderpower.worldgen.Enderpowerworldgen;

@Mod(modid = R.MODID, name = R.MODNAME, version = R.VERSION)

public class Enderpower {


	
	
	
	
	
	
	
	@SidedProxy(clientSide = "enderpower.main.ClientProxy", serverSide = "enderpower.main.ServerProxy")
	public static ServerProxy proxy;
	
	
	
	
	

	
	
	
	//creative tabblad
	public static CreativeTabs enderpowermagicitemstab = new Enderpowertab(CreativeTabs.getNextID(), "enderpowermagicitems" + R.TABNAME);
	public static CreativeTabs enderpowersieblockstab = new EnderpowerSietab(CreativeTabs.getNextID(), "enderpowersieblocksTab");
	
	@Instance(R.MODID)
	public static Enderpower modInstance;


	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.RegisterRenderThings();
		EnderpowerBlocks.load();
		EnderpowerBlocks.Registeritems();
		EnderpowerItems.load();
		EnderpowerItems.RegisterItems();
		ToolRegistratie.load();
		ToolRegistratie.RegisterItem();
		MinecraftForge.EVENT_BUS.register(new RegisterMobDrops());
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Enderpowerworldgen.load();
		EnderpowerSmeltingRecipes.load();
		EntityHandler.RegisterMonsters(EntityEnderhunter.class, "enderhunter");
		MinecraftForge.EVENT_BUS.register(new EnderpowerEventHandler());

	}
	
	
	


	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
