package DiamondEnder.items;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import DiamondEnder.DiamondEnder;
 
public class IronEnderIngot extends Item {

	// Constructors
	public IronEnderIngot() {
		
		super();
		this.setUnlocalizedName("IronEnderIngot");
		this.setTextureName("recipeplus:blueberry");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT1);
	}
 
}