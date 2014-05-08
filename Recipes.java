package DiamondEnder;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
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
import DiamondEnder.items.tools.diamondEnder.DiamondEnderAxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderMultiTool;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderPickaxe;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderShovel;
import DiamondEnder.items.tools.diamondEnder.DiamondEnderSword;
import DiamondEnder.items.tools.goldEnder.GoldEnderPickaxe;
import DiamondEnder.items.tools.goldEnder.GoldEnderSword;
import DiamondEnder.items.tools.ironEnder.IronEnderPickaxe;
import DiamondEnder.items.tools.ironEnder.IronEnderSword;
import DiamondEnder.util.RecipeEventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Recipes {

    this.addShapedRecipe(
