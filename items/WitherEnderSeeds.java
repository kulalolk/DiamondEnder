package DiamondEnder.items;
 
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.IPlantable;
import DiamondEnder.DiamondEnder;
 
public class WitherEnderSeeds extends ItemSeeds implements IPlantable{

	private static Block field_150925_a;

	// Constructors
	public WitherEnderSeeds() {
		
		super(field_150925_a, field_150925_a);
		this.setUnlocalizedName("WitherEnderSeeds");
		this.setTextureName("recipeplus:blueberry");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT4);
	}
 
}