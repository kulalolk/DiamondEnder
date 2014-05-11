package DiamondEnder.items.tools.goldEnder;
 
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import DiamondEnder.DiamondEnder;
 
public class GoldEnderAxe extends ItemAxe {

	// Constructors
	public GoldEnderAxe(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("GoldEnderAxe");
		this.setTextureName("diamondender:GoldEnderAxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT2);
	}
}