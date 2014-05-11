package DiamondEnder.items.tools.witherEnder;
 
import java.util.List;

import DiamondEnder.DiamondEnder;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class WitherEnderSword extends ItemSword {

	// Constructors
	public WitherEnderSword(ToolMaterial material)
	{
		
		super(material);
;		this.setUnlocalizedName("WitherEnderSword");
		this.setTextureName("diamondender:WitherEnderSword");
		this.setCreativeTab(DiamondEnder.tabDiamondEnderT4);
	}
}