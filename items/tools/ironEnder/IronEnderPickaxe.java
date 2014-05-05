package DiamondEnder.items.tools.ironEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class IronEnderPickaxe extends ItemPickaxe {
 
	// Constructors
	public IronEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("IronEnderPickaxe");
		this.setTextureName("diamondender:IronEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
}