package DiamondEnder.items.tools.diamondEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemSword;
 
public class DiamondEnderSword extends ItemSword {
 
	// Constructors
	public DiamondEnderSword(ToolMaterial material)
	{
		
		super(material);
		this.addEnchantment(Enchantment.fortune, 5);
;		this.setUnlocalizedName("DiamondEnderSword");
		this.setTextureName("diamondender:DiamondEnderSword");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}

	private void addEnchantment(Enchantment fortune, int i) {
		
	}
}