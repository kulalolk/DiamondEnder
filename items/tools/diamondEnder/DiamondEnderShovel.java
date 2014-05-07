package DiamondEnder.items.tools.diamondEnder;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import DiamondEnder.DiamondEnder;
 
public class DiamondEnderShovel extends ItemSpade
	{
	// Constructors
	public DiamondEnderShovel(ToolMaterial material)
	{

		super(material);
		this.setUnlocalizedName("DiamondEnderShovel");
		this.setTextureName("diamondender:DiamondEnderShovel");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
}