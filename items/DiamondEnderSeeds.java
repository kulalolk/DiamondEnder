package DiamondEnder.items;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import nte.minecraft.item.ItemSeeds
import DiamondEnder.DiamondEnder;
 
public class DiamondEnderSeeds extends ItemSeeds
	// Constructors
	public DiamondEnderSeeds() {
		
		super();
		this.setUnlocalizedName("DiamondEnderSeeds");
		this.setTextureName("diamondender:DiamondEnderSeeds");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
 
}
