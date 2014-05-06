package DiamondEnder;
 
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import DiamondEnder.blocks.DiamondEnderCrop;
import DiamondEnder.blocks.GoldEnderCrop;
import DiamondEnder.blocks.IronEnderCrop;
import DiamondEnder.items.DiamondEnderIngot;
import DiamondEnder.items.DiamondEnderSeeds;
import DiamondEnder.items.GoldEnderIngot;
import DiamondEnder.items.GoldEnderSeeds;
import DiamondEnder.items.IronEnderIngot;
import DiamondEnder.items.IronEnderSeeds;
import DiamondEnder.items.RawDiamondEnder;
import DiamondEnder.items.RawGoldEnder;
import DiamondEnder.items.RawIronEnder;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderPickaxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderSword;
import DiamondEnder.items.tools.goldEnder.GoldEnderPickaxe;
import DiamondEnder.items.tools.ironEnder.IronEnderPickaxe;
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
 
    //Creative Tabs    
    public static CreativeTabs tabDiamondEnderT1 = new DiamondEnderTabT1(CreativeTabs.getNextID(), "DiamondEnderT1");
    public static CreativeTabs tabDiamondEnderT2 = new DiamondEnderTabT2(CreativeTabs.getNextID(), "DiamondEnderT2");
    public static CreativeTabs tabDiamondEnderT3 = new DiamondEnderTabT3(CreativeTabs.getNextID(), "DiamondEnderT3");
    
    //Materials    
    static ToolMaterial IronEnder = EnumHelper.addToolMaterial("IronEnder", 4, 2500, 15.0F, 3.0F, 30);
    static ToolMaterial GoldEnder = EnumHelper.addToolMaterial("GoldEnder", 4, 5000, 17.5F, 4.0F, 30);
    static ToolMaterial DiamondEnder = EnumHelper.addToolMaterial("DiamondEnder", 4, -1, 20.0F, 16.0F, 30);


    //Items & Blocks (Tier 1)
    public final static Block IronEnderCrop = new IronEnderCrop();
    public final static Item IronEnderSeeds = new IronEnderSeeds();
    public final static Item RawIronEnder = new RawIronEnder();
    public final static Item IronEnderIngot = new IronEnderIngot();
    public final static Item IronEnderPickaxe = new IronEnderPickaxe(IronEnder);
    
    //Items & Blocks (Tier 2)
    public final static Block GoldEnderCrop = new GoldEnderCrop();
    public final static Item GoldEnderSeeds = new GoldEnderSeeds();
    public final static Item RawGoldEnder = new RawGoldEnder();
    public final static Item GoldEnderIngot = new GoldEnderIngot();
    public final static Item GoldEnderPickaxe = new GoldEnderPickaxe(GoldEnder);
    
    //Items & Blocks (Tier 3)
    public final static Block DiamondEnderCrop = new DiamondEnderCrop();
    public final static Item DiamondEnderSeeds = new DiamondEnderSeeds();
    public final static Item RawDiamondEnder = new RawDiamondEnder();
    public final static Item DiamondEnderIngot = new DiamondEnderIngot();
    public final static Item DiamondEnderPickaxe = new DiamondEnderPickaxe(DiamondEnder);
    public final static Item DiamondEnderSword = new DiamondEnderSword(DiamondEnder);
    
    @EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry."
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
        // DEBUG
        System.out.println("preInit()");

        //Item & Block Registry (Tier 1)
    	GameRegistry.registerBlock(IronEnderCrop, "IronEnderCrop");
    	GameRegistry.registerItem(IronEnderSeeds, "IronEnderSeeds");
    	GameRegistry.registerItem(RawIronEnder, "RawIronEnder");
    	GameRegistry.registerItem(IronEnderIngot, "IronEnderIngot");
    	GameRegistry.registerItem(IronEnderPickaxe, "IronEnderPickaxe");
        
        //Item & Block Registry (Tier 2)
    	GameRegistry.registerBlock(GoldEnderCrop, "GoldEnderCrop");
    	GameRegistry.registerItem(GoldEnderSeeds, "GoldEnderSeeds");
    	GameRegistry.registerItem(RawGoldEnder, "RawGoldEnder");
    	GameRegistry.registerItem(GoldEnderIngot, "GoldEnderIngot");
    	GameRegistry.registerItem(GoldEnderPickaxe, "GoldEnderPickaxe");
    	
    	//Item & Block Registry (Tier 3)
    	GameRegistry.registerBlock(DiamondEnderCrop, "DiamondEnderCrop");
    	GameRegistry.registerItem(DiamondEnderSeeds, "DiamondEnderSeeds");
    	GameRegistry.registerItem(RawDiamondEnder, "RawDiamondEnder");
    	GameRegistry.registerItem(DiamondEnderIngot, "DiamondEnderIngot");
    	GameRegistry.registerItem(DiamondEnderPickaxe, "DiamondEnderPickaxe");
    	GameRegistry.registerItem(DiamondEnderSword, "DiamondEnderSword");

    	//Language Registry (Tier 1)
    	LanguageRegistry.addName(IronEnderCrop, "Iron Ender Crop");
    	LanguageRegistry.addName(IronEnderSeeds, "§eIron Ender Seeds" + "§8 {Tier 1}");
    	LanguageRegistry.addName(RawIronEnder, "§eRaw Iron Ender" + "§8 {Tier 1}");
    	LanguageRegistry.addName(IronEnderIngot, "§eIron Ender Ingot" + "§8 {Tier 1}");
    	LanguageRegistry.addName(IronEnderPickaxe, "§eIron Ender Pickaxe" + "§8 {Tier 1}");
    	
    	//Language Registry (Tier 2)
    	LanguageRegistry.addName(GoldEnderCrop, "Gold Ender Crop");
    	LanguageRegistry.addName(GoldEnderSeeds, "§eGold Ender Seeds" + "§8 {Tier 2}");
    	LanguageRegistry.addName(RawGoldEnder, "§eRaw Gold Ender" + "§8 {Tier 2}");
    	LanguageRegistry.addName(GoldEnderIngot, "§eGold Ender Ingot" + "§8 {Tier 2}");
    	LanguageRegistry.addName(GoldEnderPickaxe, "§eGold Ender Pickaxe" + "§8 {Tier 2}");
    	
    	//Language Registry (Tier 3)
    	LanguageRegistry.addName(DiamondEnderCrop, "Diamond Ender Crop");
    	LanguageRegistry.addName(DiamondEnderSeeds, "§eDiamond Ender Seeds" + "§8 {Tier 3}");
    	LanguageRegistry.addName(RawDiamondEnder, "§eRaw Diamond Ender" + "§8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderIngot, "§eDiamond Ender Ingot" + "§8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderPickaxe, "§eDiamond Ender Pickaxe" + "§8 {Tier 3}");
    	LanguageRegistry.addName(DiamondEnderSword, "§eDiamond Ender Sword" + "§8 {Tier 3}");
    	
    	
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