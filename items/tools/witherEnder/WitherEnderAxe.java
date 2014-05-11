package DiamondEnder.items.tools.witherEnder;
 
import java.util.List;

import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class WitherEnderAxe extends ItemAxe {

	// Constructors
	public WitherEnderAxe(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("WitherEnderAxe");
		this.setTextureName("diamondender:WitherEnderAxe");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT4);
	}
}