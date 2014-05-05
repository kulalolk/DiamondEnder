package DiamondEnder.items;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import DiamondEnder.DiamondEnder;
 
public class DiamondEnderIngot extends Item {
 
	// Constructors
	public DiamondEnderIngot() {
		
		super();
		this.setUnlocalizedName("DiamondEnderIngot");
		this.setTextureName("diamondender:DiamondEnderIngot");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3); 
	}
}