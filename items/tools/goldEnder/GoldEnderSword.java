package DiamondEnder.items.tools.goldEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
 
public class GoldEnderSword extends ItemSword {
 
	// Constructors
	public GoldEnderSword(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("GoldEnderSword");
		this.setTextureName("diamondender:GoldEnderSword");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT2);
	}
}