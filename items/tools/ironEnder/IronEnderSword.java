package DiamondEnder.items.tools.ironEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
 
public class IronEnderSword extends ItemSword {
 
	// Constructors
	public IronEnderSword(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("IronEnderSword");
		this.setTextureName("diamondender:IronEnderSword");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
}