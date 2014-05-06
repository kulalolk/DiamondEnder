package DiamondEnder.items.tools.diamondEnder;
 
import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemPickaxe;
 
public class DiamondEnderPickaxe extends ItemPickaxe {
 
	// Constructors
	public DiamondEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
		this.addEnchantment(Enchantment.fortune, 5);
;		this.setUnlocalizedName("DiamondEnderPickaxe");
		this.setTextureName("diamondender:DiamondEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}

	private void addEnchantment(Enchantment fortune, int i) {
		
	}
}