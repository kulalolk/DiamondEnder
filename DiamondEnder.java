package DiamondEnder;
 
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import DiamondEnder.blocks.DiamondEnderCrop;
import DiamondEnder.blocks.GoldEnderCrop;
import DiamondEnder.blocks.IronEnderCrop;
import DiamondEnder.blocks.WitherEnderCropBack;
import DiamondEnder.items.DiamondEnderEssence;
import DiamondEnder.items.DiamondEnderIngot;
import DiamondEnder.items.DiamondEnderSeeds;
import DiamondEnder.items.GoldEnderIngot;
import DiamondEnder.items.GoldEnderSeeds;
import DiamondEnder.items.IronEnderIngot;
import DiamondEnder.items.IronEnderSeeds;
import DiamondEnder.items.RawDiamondEnder;
import DiamondEnder.items.RawGoldEnder;
import DiamondEnder.items.RawIronEnder;
import DiamondEnder.items.RawEndericSeed;
import DiamondEnder.items.RawWitherEnder;
import DiamondEnder.items.WitherEnderEssence;
import DiamondEnder.items.WitherEnderIngot;
import DiamondEnder.items.WitherEnderSeeds;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderAxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderPickaxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderShovel;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderSword;
import DiamondEnder.items.tools.goldEnder.GoldEnderAxe;
import DiamondEnder.items.tools.goldEnder.GoldEnderPickaxe;
import DiamondEnder.items.tools.goldEnder.GoldEnderShovel;
import DiamondEnder.items.tools.goldEnder.GoldEnderSword;
import DiamondEnder.items.tools.ironEnder.IronEnderAxe;
import DiamondEnder.items.tools.ironEnder.IronEnderPickaxe;
import DiamondEnder.items.tools.ironEnder.IronEnderShovel;
import DiamondEnder.items.tools.ironEnder.IronEnderSword;
import DiamondEnder.items.tools.witherEnder.WitherEnderAxe;
import DiamondEnder.items.tools.witherEnder.WitherEnderPickaxe;
import DiamondEnder.items.tools.witherEnder.WitherEnderShovel;
import DiamondEnder.items.tools.witherEnder.WitherEnderSword;
import DiamondEnder.util.DiamondEnderTabT1;
import DiamondEnder.util.DiamondEnderTabT2;
import DiamondEnder.util.DiamondEnderTabT3;
import DiamondEnder.util.DiamondEnderTabT4;
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
    public static CreativeTabs tabDiamondEnderT4 = new DiamondEnderTabT4(CreativeTabs.getNextID(), "DiamondEnderT4");
    
    //Materials    
    static ToolMaterial IronEnder = EnumHelper.addToolMaterial("IronEnder", 4, 2500, 15.0F, 6.0F, 30);
    static ToolMaterial GoldEnder = EnumHelper.addToolMaterial("GoldEnder", 4, 5000, 17.5F, 11.0F, 30);
    static ToolMaterial DiamondEnder = EnumHelper.addToolMaterial("DiamondEnder", 4, 10000, 20.0F, 16.0F, 30);
    static ToolMaterial WitherEnder = EnumHelper.addToolMaterial("WitherEnder", 4, -1, 15.0F, 46.0F, 30);
    
    //Items & Blocks (misc.)
    public final static Item RawEndericSeed = new RawEndericSeed();

    //Items & Blocks (Tier 1)
    public final static Block IronEnderCrop = new IronEnderCrop();
    public final static Item IronEnderSeeds = new IronEnderSeeds();
    public final static Item RawIronEnder = new RawIronEnder();
    public final static Item IronEnderIngot = new IronEnderIngot();
    public final static Item IronEnderSword = new IronEnderSword(IronEnder);
    public final static Item IronEnderPickaxe = new IronEnderPickaxe(IronEnder);
    public final static Item IronEnderAxe = new IronEnderAxe(IronEnder);
    public final static Item IronEnderShovel = new IronEnderShovel(IronEnder);
    
    //Items & Blocks (Tier 2)
    public final static Block GoldEnderCrop = new GoldEnderCrop();
    public final static Item GoldEnderSeeds = new GoldEnderSeeds();
    public final static Item RawGoldEnder = new RawGoldEnder();
    public final static Item GoldEnderIngot = new GoldEnderIngot();
    public final static Item GoldEnderSword = new GoldEnderSword(GoldEnder);
    public final static Item GoldEnderPickaxe = new GoldEnderPickaxe(GoldEnder);
    public final static Item GoldEnderAxe = new GoldEnderAxe(GoldEnder);
    public final static Item GoldEnderShovel = new GoldEnderShovel(GoldEnder);
    
    //Items & Blocks (Tier 3)
    public final static Block DiamondEnderCrop = new DiamondEnderCrop();
    public final static Item DiamondEnderSeeds = new DiamondEnderSeeds();
    public final static Item RawDiamondEnder = new RawDiamondEnder();
    public final static Item DiamondEnderIngot = new DiamondEnderIngot();
    public final static Item DiamondEnderEssence = new DiamondEnderEssence();
    public final static Item DiamondEnderSword = new DiamondEnderSword(DiamondEnder);
    public final static Item DiamondEnderPickaxe = new DiamondEnderPickaxe(DiamondEnder);
    public final static Item DiamondEnderAxe = new DiamondEnderAxe(DiamondEnder);
    public final static Item DiamondEnderShovel = new DiamondEnderShovel(DiamondEnder);
    
    //Items & Blocks (Tier 4)
    public final static Block WitherEnderCrop = new WitherEnderCropBack();
    public final static Item WitherEnderSeeds = new WitherEnderSeeds();
    public final static Item RawWitherEnder = new RawWitherEnder();
    public final static Item WitherEnderIngot = new WitherEnderIngot();
    public final static Item WitherEnderEssence = new WitherEnderEssence();
    public final static Item WitherEnderSword = new WitherEnderSword(WitherEnder);
    public final static Item WitherEnderPickaxe = new WitherEnderPickaxe(WitherEnder);
    public final static Item WitherEnderAxe = new WitherEnderAxe(WitherEnder);
    public final static Item WitherEnderShovel = new WitherEnderShovel(WitherEnder);

    @EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry."
    public void preInit(FMLPreInitializationEvent event) {
    	
        // DEBUG
        System.out.println("preInit()");
        
        //Item & Block Registry (MISC.)
        GameRegistry,registerItem(RawEndericSeed, "RawEndericSeed");
        
        //Item & Block Registry (Tier 1)
    	GameRegistry.registerBlock(IronEnderCrop, "IronEnderCrop");
    	GameRegistry.registerItem(IronEnderSeeds, "IronEnderSeeds");
    	GameRegistry.registerItem(RawIronEnder, "RawIronEnder");
    	GameRegistry.registerItem(IronEnderIngot, "IronEnderIngot");
    	GameRegistry.registerItem(IronEnderSword, "IronEnderSword");
    	GameRegistry.registerItem(IronEnderPickaxe, "IronEnderPickaxe");
    	GameRegistry.registerItem(IronEnderAxe, "IronEnderAxe");
    	GameRegistry.registerItem(IronEnderShovel, "IronEnderShovel");
        
    	//Item & Block Registry (Tier 2)
    	GameRegistry.registerBlock(GoldEnderCrop, "GoldEnderCrop");
    	GameRegistry.registerItem(GoldEnderSeeds, "GoldEnderSeeds");
    	GameRegistry.registerItem(RawGoldEnder, "RawGoldEnder");
    	GameRegistry.registerItem(GoldEnderIngot, "GoldEnderIngot");
    	GameRegistry.registerItem(GoldEnderSword, "GoldEnderSword");
    	GameRegistry.registerItem(GoldEnderPickaxe, "GoldEnderPickaxe");
    	GameRegistry.registerItem(GoldEnderAxe, "GoldEnderAxe");
    	GameRegistry.registerItem(GoldEnderShovel, "GoldEnderShovel");
    	
    	//Item & Block Registry (Tier 3)
    	GameRegistry.registerBlock(DiamondEnderCrop, "DiamondEnderCrop");
    	GameRegistry.registerItem(DiamondEnderSeeds, "DiamondEnderSeeds");
    	GameRegistry.registerItem(RawDiamondEnder, "RawDiamondEnder");
    	GameRegistry.registerItem(DiamondEnderIngot, "DiamondEnderIngot");
    	GameRegistry.registerItem(DiamondEnderEssence, "DiamondEnderEssence");
    	GameRegistry.registerItem(DiamondEnderSword, "DiamondEnderSword");
    	GameRegistry.registerItem(DiamondEnderPickaxe, "DiamondEnderPickaxe");
    	GameRegistry.registerItem(DiamondEnderAxe, "DiamondEnderAxe");
    	GameRegistry.registerItem(DiamondEnderShovel, "DiamondEnderShovel");
    	
    	//Item & Block Registry (Tier 4)
    	GameRegistry.registerBlock(WitherEnderCrop, "WitherEnderCrop");
    	GameRegistry.registerItem(WitherEnderSeeds, "WitherEnderSeeds");
    	GameRegistry.registerItem(RawWitherEnder, "RawWitherEnder");
    	GameRegistry.registerItem(WitherEnderIngot, "WitherEnderIngot");
    	GameRegistry.registerItem(WitherEnderEssence, "WitherEnderEssence");
    	GameRegistry.registerItem(WitherEnderSword, "WitherEnderSword");
    	GameRegistry.registerItem(WitherEnderPickaxe, "WitherEnderPickaxe");
    	GameRegistry.registerItem(WitherEnderAxe, "WitherEnderAxe");
    	GameRegistry.registerItem(WitherEnderShovel, "WitherEnderShovel");
    	
    	//Language Registry (MISC.)
    	LanguageRegistry.addName(RawEndericSeed, "Raw Enderic Seed");
    	
    	//Language Registry (Tier 1)
    	LanguageRegistry.addName(IronEnderCrop, "Iron Ender Crop [WIP - MAY CRASH]");
    	LanguageRegistry.addName(IronEnderSeeds, "Iron Ender Seeds" + "{Tier 1} [WIP - MAY CRASH]");
    	LanguageRegistry.addName(RawIronEnder, "Raw Iron Ender" + "{Tier 1}");
    	LanguageRegistry.addName(IronEnderIngot, "Iron Ender Ingot" + "{Tier 1}");
    	LanguageRegistry.addName(IronEnderSword, "Iron Ender Sword" + "{Tier 1}");
    	LanguageRegistry.addName(IronEnderPickaxe, "Iron Ender Pickaxe" + " {Tier 1}");
    	LanguageRegistry.addName(IronEnderShovel, "Iron Ender Shovel" + "{Tier 1}");
    	LanguageRegistry.addName(IronEnderAxe, "Iron Ender Axe" + "{Tier 1}");
    	
    	//Language Registry (Tier 2)
    	LanguageRegistry.addName(GoldEnderCrop, "Gold Ender Crop [WIP - MAY CRASH]");
    	LanguageRegistry.addName(GoldEnderSeeds, "Gold Ender Seeds" + "{Tier 2} [WIP - MAY CRASH]");
    	LanguageRegistry.addName(RawGoldEnder, "Raw Gold Ender" + "{Tier 2}");
    	LanguageRegistry.addName(GoldEnderIngot, "Gold Ender Ingot" + "{Tier 2}");
    	LanguageRegistry.addName(GoldEnderSword, "Gold Ender Sword" + "{Tier 2}");
    	LanguageRegistry.addName(GoldEnderPickaxe, "Gold Ender Pickaxe" + "{Tier 2}");
    	LanguageRegistry.addName(GoldEnderShovel, "Gold Ender Shovel" + "{Tier 2}");
    	LanguageRegistry.addName(GoldEnderAxe, "Gold Ender Axe" + "{Tier 2}");
    	
    	//Language Registry (Tier 3)
    	LanguageRegistry.addName(DiamondEnderCrop, "Diamond Ender Crop [WIP - MAY CRASH]");
    	LanguageRegistry.addName(DiamondEnderSeeds, "Diamond Ender Seeds" + "{Tier 3} [WIP - MAY CRASH]");
    	LanguageRegistry.addName(RawDiamondEnder, "Raw Diamond Ender" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderEssence, "Diamond Ender Essence" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderIngot, "Diamond Ender Ingot" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderSword, "Diamond Ender Sword" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderPickaxe, "Diamond Ender Pickaxe" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderShovel, "Diamond Ender Shovel" + "{Tier 3}");
    	LanguageRegistry.addName(DiamondEnderAxe, "Diamond Ender Axe" + "{Tier 3}");
    	
    	//Language Registry (Tier 4)
    	LanguageRegistry.addName(WitherEnderCrop, "Wither Ender Crop [WIP - MAY CRASH]");
    	LanguageRegistry.addName(WitherEnderSeeds, "Wither Ender Seeds" + "{Tier 4} [WIP - MAY CRASH]");
    	LanguageRegistry.addName(RawWitherEnder, "Raw Wither Ender" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderEssence, "Wither Ender Essence" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderIngot, "Wither Ender Ingot" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderSword, "Wither Ender Sword" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderPickaxe, "Wither Ender Pickaxe" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderShovel, "Wither Ender Shovel" + "{Tier 4}");
    	LanguageRegistry.addName(WitherEnderAxe, "Wither Ender Axe" + "{Tier 4}");
    	
    	//Recipes (Tier 1)
    	GameRegistry.addShapedRecipe(new ItemStack(RawIronEnder, 2), "yxy", "xyx", "yxy", 'x', Items.ender_pearl, 'y', Items.iron_ingot);
    	GameRegistry.addShapedRecipe(new ItemStack(RawIronEnder, 2), "xyx", "yxy", "xyx", 'x', Items.ender_pearl, 'y', Items.iron_ingot);
    	GameRegistry.addSmelting(RawIronEnder, new ItemStack(IronEnderIngot), 100.0F);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(IronEnderSword), " x ", " x ", " y ", 'x', IronEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(IronEnderPickaxe), "xxx", " y ", " y ", 'x', IronEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(IronEnderShovel), " x ", " y ", " y ", 'x', IronEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(IronEnderAxe), "xx ", "xy ", " y ", 'x', IronEnderIngot, 'y', Items.stick);
    	
    	//Recipes (Tier 2)
    	GameRegistry.addShapedRecipe(new ItemStack(RawGoldEnder, 2), "yxy", "xyx", "yxy", 'x', Items.ender_pearl, 'y', Items.gold_ingot);
    	GameRegistry.addShapedRecipe(new ItemStack(RawGoldEnder, 2), "xyx", "yxy", "xyx", 'x', Items.ender_pearl, 'y', Items.gold_ingot);
    	GameRegistry.addSmelting(RawGoldEnder, new ItemStack(GoldEnderIngot), 100.0F);
    
    	GameRegistry.addShapedRecipe(new ItemStack(GoldEnderSword), " x ", " x ", " y ", 'x', GoldEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(GoldEnderPickaxe), "xxx", " y ", " y ", 'x', GoldEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(GoldEnderShovel), " x ", " y ", " y ", 'x', GoldEnderIngot, 'y', Items.stick);
    	GameRegistry.addShapedRecipe(new ItemStack(GoldEnderAxe), "xx ", "xy ", " y ", 'x', GoldEnderIngot, 'y', Items.stick);
    	
    	//Recipes (Tier 3)
    	GameRegistry.addShapedRecipe(new ItemStack(RawDiamondEnder, 4), "yxy", "xyx", "yxy", 'x', Items.ender_pearl, 'y', Items.diamond);
    	GameRegistry.addShapedRecipe(new ItemStack(RawDiamondEnder, 4), "xyx", "yxy", "xyx", 'x', Items.ender_pearl, 'y', Items.diamond);
    	GameRegistry.addSmelting(RawDiamondEnder, new ItemStack(DiamondEnderIngot), 100.0F);
    	
    	ItemStack DiamondEnderSwordStack = new ItemStack(DiamondEnderSword);
    	DiamondEnderSwordStack.addEnchantment(Enchantment.looting, 2);
    	DiamondEnderSwordStack.addEnchantment(Enchantment.unbreaking, 2);
    	DiamondEnderSwordStack.addEnchantment(Enchantment.baneOfArthropods, 2);
    	CraftingManager.getInstance().addRecipe(DiamondEnderSwordStack, "x", "x", "y", 'x', DiamondEnderIngot, 'y', Items.stick);
    	
    	ItemStack DiamondEnderPickaxeStack = new ItemStack(DiamondEnderPickaxe);
    	DiamondEnderPickaxeStack.addEnchantment(Enchantment.fortune, 2);
    	DiamondEnderPickaxeStack.addEnchantment(Enchantment.unbreaking, 2);
    	CraftingManager.getInstance().addRecipe(DiamondEnderPickaxeStack, "xxx", " y ", " y ", 'x', DiamondEnderIngot, 'y', Items.stick);
    	
    	ItemStack DiamondEnderShovelStack = new ItemStack(DiamondEnderShovel);
    	DiamondEnderShovelStack.addEnchantment(Enchantment.fortune, 2);
    	DiamondEnderShovelStack.addEnchantment(Enchantment.unbreaking, 2);
    	CraftingManager.getInstance().addRecipe(DiamondEnderShovelStack, "x", "y", "y", 'x', DiamondEnderIngot, 'y', Items.stick);
    	
    	ItemStack DiamondEnderAxeStack = new ItemStack(DiamondEnderAxe);
    	DiamondEnderAxeStack.addEnchantment(Enchantment.fortune, 2);
    	DiamondEnderAxeStack.addEnchantment(Enchantment.unbreaking, 2);
    	CraftingManager.getInstance().addRecipe(DiamondEnderAxeStack, "xx ", "xy ", " y ", 'x', DiamondEnderIngot, 'y', Items.stick);
    	
    	//Recipes (Tier 4)
    	GameRegistry.addShapedRecipe(new ItemStack(WitherEndericSeed, 1), "xxx", "xyx", "xxx", 'x', Items.nether_star, 'y', RawEndericSeed);
    	
    	GameRegistry.addShapedRecipe(new ItemStack(RawWitherEnder, 4), "yxy", "xyx", "yxy", 'x', Items.ender_pearl, 'y', Items.nether_star);
    	GameRegistry.addShapedRecipe(new ItemStack(RawWitherEnder, 4), "xyx", "yxy", "xyx", 'x', Items.ender_pearl, 'y', Items.nether_star);
    	GameRegistry.addSmelting(RawWitherEnder, new ItemStack(WitherEnderIngot), 100.0F);
    	
    	ItemStack WitherEnderSwordStack = new ItemStack(WitherEnderSword);
    	WitherEnderSwordStack.addEnchantment(Enchantment.looting, 5);
    	WitherEnderSwordStack.addEnchantment(Enchantment.unbreaking, 5);
    	WitherEnderSwordStack.addEnchantment(Enchantment.baneOfArthropods, 5);
   	WitherEnderSwordStack.addEffect(Effect.wither, 5);
    	CraftingManager.getInstance().addRecipe(WitherEnderSwordStack, "x", "x", "y", 'x', WitherEnderIngot, 'y', Items.stick);
    	
    	ItemStack WitherEnderPickaxeStack = new ItemStack(WitherEnderPickaxe);
    	WitherEnderPickaxeStack.addEnchantment(Enchantment.fortune, 5);
    	WitherEnderPickaxeStack.addEnchantment(Enchantment.unbreaking, 5);
    	CraftingManager.getInstance().addRecipe(WitherEnderPickaxeStack, "xxx", " y ", " y ", 'x', WitherEnderIngot, 'y', Items.stick);
    	
    	ItemStack WitherEnderShovelStack = new ItemStack(WitherEnderShovel);
    	WitherEnderShovelStack.addEnchantment(Enchantment.fortune, 5);
    	WitherEnderShovelStack.addEnchantment(Enchantment.unbreaking, 5);
    	CraftingManager.getInstance().addRecipe(WitherEnderShovelStack, "x", "y", "y", 'x', WitherEnderIngot, 'y', Items.stick);
    	
    	ItemStack WitherEnderAxeStack = new ItemStack(WitherEnderAxe);
    	WitherEnderAxeStack.addEnchantment(Enchantment.fortune, 5);
    	WitherEnderAxeStack.addEnchantment(Enchantment.unbreaking, 5);
    	CraftingManager.getInstance().addRecipe(WitherEnderAxeStack, "xx ", "xy ", " y ", 'x', WitherEnderIngot, 'y', Items.stick);

    	//Misc Recipes
    	ItemStack WitherHeadStack = new ItemStack(Items.skull, 1, 1);
    	GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "xxx", "yyy", "zyz", 'x', WitherHeadStack, 'y', Blocks.soul_sand, 'z', Items.diamond );
    	
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
