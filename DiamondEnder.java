package DiamondEnder;
 
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import DiamondEnder.blocks.DiamondEnderCrop;
import DiamondEnder.items.DiamondEnderIngot;
import DiamondEnder.items.DiamondEnderSeeds;
import DiamondEnder.items.RawDiamondEnder;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderSword;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderPickaxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderAxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderShovel;
import DiamondEnder.util.DiamondEnderTabT1;
import DiamondEnder.util.DiamondEnderTabT2;
import DiamondEnder.util.DiamondEnderTabT3;
import DiamondEnder.util.RecipeEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid = DiamondEnder.MODID, name = DiamondEnder.MODNAME, version = DiamondEnder.VERSION)

public class DiamondEnder
{
    public static final String MODID = "DiamondEnder";
    public static final String MODNAME = "Diamond Ender by kulalolk";
    public static final String VERSION = "0.0.1";
 
    //CREATIVE TABS
    public static CreativeTabs tabDiamondEnderT1 = new DiamondEnderTabT1(CreativeTabs.getNextID(), "DiamondEnderT1");
    public static CreativeTabs tabDiamondEnderT2 = new DiamondEnderTabT2(CreativeTabs.getNextID(), "DiamondEnderT2");
    public static CreativeTabs tabDiamondEnderT3 = new DiamondEnderTabT3(CreativeTabs.getNextID(), "DiamondEnderT3");
    
    //TOOL MATERIALS
    static ToolMaterial DiamondEnder = EnumHelper.addToolMaterial("DiamondEnder", 4, -1, 20.0F, 5.0F, 30);
    static ToolMaterial GoldEnder = EnumHelper.addToolMaterial("GoldEnder", 4, -1, 17.5F, 4.0F, 30);
    static ToolMaterial IronEnder = EnumHelper.addToolMaterial("IronEnder", 4, -1, 15.0F, 3.0F, 30);
   
    //IMPORT BLOCKS & ITEMS
    public final static Block DiamondEnderCrop = new DiamondEnderCrop();
    public final static Item DiamondEnderSeeds = new DiamondEnderSeeds();
    public final static Item RawDiamondEnder = new RawDiamondEnder();
    public final static Item DiamondEnderIngot = new DiamondEnderIngot();
    public final static Item DiamondEnderSword = new DiamondEnderSword(DiamondEnder);
    public final static Item DiamondEnderPickaxe = new DiamondEnderPickaxe(DiamondEnder);
    public final static Item DiamondEnderAxe = new DiamondEnderAxe(DiamondEnder);
    public final static Item DiamondEnderShovel = new DiamondEnderShovel(DiamondEnder);
    
    @EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry."
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
        // DEBUG
        System.out.println("preInit()");
    	
    	//REGISTER BLOCKS & ITEMS
    	GameRegistry.registerBlock(DiamondEnderCrop, "DiamondEnderCrop");
    	GameRegistry.registerItem(DiamondEnderSeeds, "DiamondEnderSeeds");
    	GameRegistry.registerItem(RawDiamondEnder, "RawDiamondEnder");
    	GameRegistry.registerItem(DiamondEnderIngot, "DiamondEnderIngot");
    	GameRegistry.registerItem(DiamondEnderSword, "DiamondEnderSword");
    	GameRegistry.registerItem(DiamondEnderPickaxe, "DiamondEnderPickaxe");
    	GameRegistry.registerItem(DiamondEnderAxe, "DiamondEnderAxe");
    	GameRegistry.registerItem(DiamondEnderShovel, "DiamondEnderShovel");
    	
    	//ADDING NAMES TO BLOCKS & ITEMS
    	LanguageRegistry.addName(DiamondEnderCrop, "Diamond Ender Crop");
    	LanguageRegistry.addName(DiamondEnderSeeds, "�eDiamond Ender Seeds" + "�8 {Tier 3}");
    	LanguageRegistry.addName(RawDiamondEnder, "�eRaw Diamond Ender" + "�8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderIngot, "�eDiamond Ender Ingot" + "�8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderSword, "�eDiamond Ender Sword" + "�8 {Tier 3}");    	
    	LanguageRegistry.addName(DiamondEnderPickaxe, "�eDiamond Ender Pickaxe" + "�8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderAxe, "�eDiamond Ender Axe" + "�8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderShovel, "�eDiamond Ender Shovel" + "�8 {Tier 3}");
    	
    	// register tileentities
 
    }
 
    @EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void load(FMLInitializationEvent event) {
    	
        // DEBUG
        System.out.println("load()");
 
        // register custom event listeners
    	MinecraftForge.EVENT_BUS.register(new RecipeEventHandler());
    	// FMLCommonHandler.instance().bus().register(new RecipeEventHandler()); 
    }
 
    @EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this."
    public void postInit(FMLPostInitializationEvent event) {
        // DEBUG
        System.out.println("postInit()");
    }
}
