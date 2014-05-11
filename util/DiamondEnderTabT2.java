package DiamondEnder.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class DiamondEnderTabT2 extends CreativeTabs {

public DiamondEnderTabT2(int i, String tabDiamondEnderT2)
{
super(tabDiamondEnderT2);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Blocks.gold_block);
}

}