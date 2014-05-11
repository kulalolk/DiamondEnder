package DiamondEnder.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class DiamondEnderTabT3 extends CreativeTabs {

public DiamondEnderTabT3(int i, String tabDiamondEnderT3)
{
super(tabDiamondEnderT3);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Blocks.diamond_block);
}

}