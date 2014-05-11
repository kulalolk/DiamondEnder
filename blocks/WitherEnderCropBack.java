package DiamondEnder.blocks;
 
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import DiamondEnder.DiamondEnder;
import DiamondEnder.items.WitherEnderSeeds;
import DiamondEnder.items.RawWitherEnder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class WitherEnderCropBack extends BlockCrops
{
 

	public WitherEnderCropBack()
    {
    	// Basic block setup
        this.setBlockName("WitherEnderCrop");
        this.setBlockTextureName("diamondender:WitherEnderCrop");
 
    }
 
    // this is seed item for the crop
	public Item getSeedItem(){
		return DiamondEnder.WitherEnderSeeds;
	}
 
    // this is item harvested from crop
	public Item getCropItem(){
		return DiamondEnder.WitherEnderEssence;
	}
 
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
    
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_)
  {

 
  }
}