package DiamondEnder.items.tools.ironEnder;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import DiamondEnder.DiamondEnder;
 
public class IronEnderAxe extends ItemAxe {

	// Constructors
	public IronEnderAxe(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("IronEnderAxe");
		this.setTextureName("diamondender:IronEnderAxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
}