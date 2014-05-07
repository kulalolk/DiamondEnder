package DiamondEnder.items;
 
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.IPlantable;
import DiamondEnder.DiamondEnder;
 
public class DiamondEnderSeeds extends ItemSeeds implements IPlantable
{
	private static Block field_150925_a;

	// Constructors
	public DiamondEnderSeeds() {
		
		super(field_150925_a, field_150925_a);
		this.setUnlocalizedName("DiamondEnderSeeds");
		this.setTextureName("recipeplus:blueberry");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
}