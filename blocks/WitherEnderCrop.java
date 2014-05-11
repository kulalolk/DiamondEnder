package DiamondEnder.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import sun.net.www.content.text.Generic;
import DiamondEnder.DiamondEnder;

public class WitherEnderCrop extends BlockCrops {

    public WitherEnderCrop (int id) {
        super();
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
        setTickRandomly(true);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool (World world, int x,
            int y, int z) {
        return null;
    }

    @Override
    public int getRenderType () {
        return 6;
    }

    @Override
    public boolean isOpaqueCube () {
        return false;
    }

    public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
        return 32 + metadata;
    }

    @Override
    public void updateTick (World world, int x, int y, int z, Random random) {
        if (world.getBlockMetadata(x, y, z) == 1) {
            return;
        }

        if (random.nextInt(isFertile(world, x, y - 1, z) ? 12 : 25) != 0) {
            return;
        }

        world.setBlockMetadataWithNotify(x, y, z, 1, z);
    }

    public void onNeighborBlockChange (World world, int x, int y, int z,
            int neighborId) {
        if (!canBlockStay(world, x, y, z)) {
            dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
        }
    }

    @Override
    public boolean canBlockStay (World world, int x, int y, int z) {
        Block[] blocksList = null;
		@SuppressWarnings("null")
		Block soil = blocksList[world.getBlockMetadata(x, y - 1, z)];
        return (world.getFullBlockLightValue(x, y, z) >= 8 || world
                .canBlockSeeTheSky(x, y, z))
                && (soil != null && soil.canSustainPlant(world, x, y - 1, z,
                        ForgeDirection.UP, (IPlantable) DiamondEnder.WitherEnderSeeds));
    }

    public Item idDropped (int metadata, Random random) {
        switch (metadata) {
        case 0:
            return DiamondEnder.WitherEnderSeeds;
        case 1:
            return DiamondEnder.WitherEnderEssence;
        }
		return null;
    }

    public Item idPicked (World world, int x, int y, int z) {
        return DiamondEnder.WitherEnderSeeds;
    }
}