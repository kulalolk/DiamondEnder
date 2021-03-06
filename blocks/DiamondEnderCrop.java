package DiamondEnder.blocks;
 
import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import DiamondEnder.DiamondEnder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class DiamondEnderCrop extends BlockCrops implements IGrowable
{
 
    private IIcon[] field_149867_a;

	public DiamondEnderCrop()
    {
    	// Basic block setup
        this.setBlockName("DiamondEnderCrop");
        this.setBlockTextureName("diamondender:DiamondCrop_0");
    }
 
    // this is seed item for the crop
	public Item getItemSeed(){
		return DiamondEnder.DiamondEnderSeeds;
	}
 
    // this is item harvested from crop
	public Item getCropItem(){
		return DiamondEnder.DiamondEnderEssence;
	}
 
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
 }

