package DiamondEnder.items.tools.diamondEnder;
 
import java.util.List;

import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class DiamondEnderPickaxe extends ItemPickaxe {

	// Constructors
	public DiamondEnderPickaxe(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("DiamondEnderPickaxe");
		this.setTextureName("diamondender:DiamondEnderPickaxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT3);
	}
}