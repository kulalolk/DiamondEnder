package DiamondEnder.items.tools.diamondEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class DiamondEnderPickaxe extends ItemPickaxe {
 
	// Constructors
	public DiamondEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
		this.setUnlocalizedName("DiamondEnderPickaxe");
		this.setTextureName("diamondender:DiamondEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
}