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
import DiamondEnder.items.IronEnderSeeds;
import DiamondEnder.items.RawIronEnder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class IronEnderCrop extends BlockCrops
{
 
    private IIcon[] field_149867_a;

	public IronEnderCrop()
    {
    	// Basic block setup
        this.setBlockName("IronEnderCrop");
        this.setBlockTextureName("recipeplus:blueberries_stage_0");
 
    }
 
    // this is seed item for the crop
	public Item getSeedItem(){
		return DiamondEnder.IronEnderSeeds;
	}
 
    // this is item harvested from crop
	public Item getCropItem(){
		return DiamondEnder.RawIronEnder;
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
      this.field_149867_a = new IIcon[8];
      // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
      this.field_149867_a[0] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_0");
      this.field_149867_a[1] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_0");
      this.field_149867_a[2] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_1");
      this.field_149867_a[3] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_1");
      this.field_149867_a[4] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_2");
      this.field_149867_a[5] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_2");
      this.field_149867_a[6] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_3");
      this.field_149867_a[7] = p_149651_1_.registerIcon("recipeplus:blueberries_stage_3");
 
  }
}