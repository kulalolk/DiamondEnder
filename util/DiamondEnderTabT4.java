package DiamondEnder.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class DiamondEnderTabT4 extends CreativeTabs {

public DiamondEnderTabT4(int i, String tabDiamondEnderT4)
{
super(tabDiamondEnderT4);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Blocks.beacon);
  }
}
