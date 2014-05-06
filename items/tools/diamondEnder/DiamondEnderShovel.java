package DiamondEnder.items.tools.diamondEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShovel;
 
public class DiamondEnderShovel
	// Constructors
	public DiamondEnderShovel(ToolMaterial material)
	{

		super(material);
		this.setUnlocalizedName("DiamondEnderShovel");
		this.setTextureName("diamondender:DiamondEnderShovel");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
}
