package DiamondEnder.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class DiamondEnderTabT1 extends CreativeTabs {

public DiamondEnderTabT1(int i, String tabDiamondEnderT1)
{
super(tabDiamondEnderT1);
}

@Override
@SideOnly(Side.CLIENT)
public Item getTabIconItem()
{
return Item.getItemFromBlock(Blocks.sponge);
}

}