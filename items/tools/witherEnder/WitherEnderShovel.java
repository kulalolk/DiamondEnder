package DiamondEnder.items.tools.witherEnder;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import DiamondEnder.DiamondEnder;
 
public class WitherEnderShovel extends ItemSpade {

	// Constructors
	public WitherEnderShovel(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("WitherEnderShovel");
		this.setTextureName("diamondender:WitherEnderShovel");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT4);
	}
}