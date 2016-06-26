package com.jtrent238.decorationmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

@Mod(modid="decorationmod", name="jtrent238's Decoration Mod", version="1.0.0.1")
public class DecorationMod
{

	private static final String MODID = "decorationmod";
	
    
	
	@Instance(MODID)
    public static DecorationMod instance;
	public static final String MODVERSION = "1.0.0.1";

	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	public static double rand;

	private static int p_i1986_1_;
	
	// Version checking instance
	//public static VersionChecker versionChecker;
	//public static boolean haveWarnedVersionOutOfDate = false;
	
	//Enchantments
	
	
		

@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	}


private void setHarvestLevel(String string, int i) {

	
}

@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	BlockLoader.loadBlocks();
	ItemLoader.LoadItems();
	//EntityLoader.LoadEntitys();
	//ModLoader.LoadMods();
	//InventoryLoader.LoadInventorys();
	//SoundEvents.LoadSounds();
	//Recipes.registerRecpies();
	//ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ItemLoader.itemnyanapple), 2, 5, 20));
	//MinecraftForge.addGrassSeed(new ItemStack(FoodModItems.StrawberrySeeds), 5);
	//NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
	//Not Implemented Yet//NetworkRegistry.INSTANCE.registerGuiHandler(FridgeGUI.instance, new GuiHandler());
	}


public static CreativeTabs DecorationMod = new CreativeTabs("DecorationMod")
{
	public Item getTabIconItem() {

		return new ItemStack(BlockLoader.BlockTextiles1).getItem();
		//Old Icon//return new ItemStack(Items.golden_apple).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}

	}
;

//public static CreativeTabs TestStuff = new CreativeTabs("TestStuff")
//{
//	public Item getTabIconItem() {
//
//		return new ItemStack(ItemLoader.itempeach).getItem();
//	}
//
//
//	}
//;
			
@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{

	    Recipes.registerRecpies();

	}
	
	
}











}
