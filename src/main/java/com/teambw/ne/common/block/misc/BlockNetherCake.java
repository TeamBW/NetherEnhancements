package com.teambw.ne.common.block.misc;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.block.BlockCake;
import net.minecraft.world.World;

public class BlockNetherCake extends BlockCake {
    public BlockNetherCake() {
        super();
        this.setCreativeTab(ModTab.MAIN);
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {

        int worldID = world.provider.dimensionId;

        if (worldID != -1) {

            world.createExplosion(null, x, y, z, 2.0F, true);
        }

        return meta;
    }
}
