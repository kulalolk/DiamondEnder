package DiamondEnder.items.tools.goldEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class GoldEnderPickaxe extends ItemPickaxe {
 
	// Constructors
	public GoldEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("GoldEnderPickaxe");
		this.setTextureName("diamondender:GoldEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT2);
	}
}