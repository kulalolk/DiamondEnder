package DiamondEnder.items.tools.diamondEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
 
public class DiamondEnderMultiTool extends Item {

	// Constructors
	public DiamondEnderMultiTool(ToolMaterial material)
	{
		
		super();
;		this.setUnlocalizedName("DiamondEnderMultiTool");
		this.setTextureName("diamondender:DiamondEnderMultiTool");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
		this.setHasSubtypes(hasSubtypes);
	}
}