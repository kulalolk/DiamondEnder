package DiamondEnder.items.tools.witherEnder;
 
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import DiamondEnder.DiamondEnder;
 
public class WitherEnderPickaxe extends ItemPickaxe {

	// Constructors
	public WitherEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("WitherEnderPickaxe");
		this.setTextureName("diamondender:WitherEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT4);		
            }    
}
