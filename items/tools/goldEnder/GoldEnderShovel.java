package DiamondEnder.items.tools.goldEnder;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import DiamondEnder.DiamondEnder;
 
public class GoldEnderShovel extends ItemSpade {

	// Constructors
	public GoldEnderShovel(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("GoldEnderShovel");
		this.setTextureName("diamondender:GoldEnderShovel");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT2);
	}
}