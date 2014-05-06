package DiamondEnder.items;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import DiamondEnder.DiamondEnder;
 
public class IronEnderSeeds extends Item {

	// Constructors
	public IronEnderSeeds() {
		
		super();
		this.setUnlocalizedName("IronEnderSeeds");
		this.setTextureName("recipeplus:blueberry");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
 
}