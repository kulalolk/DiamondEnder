package DiamondEnder.items.tools.ironEnder;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import DiamondEnder.DiamondEnder;
 
public class IronEnderShovel extends ItemSpade {

	// Constructors
	public IronEnderShovel(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("IronEnderShovel");
		this.setTextureName("diamondender:IronEnderShovel");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
}