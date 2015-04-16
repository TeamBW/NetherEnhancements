package com.teambw.ne.common.block.misc;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.block.BlockCake;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockTNTCake extends BlockCake {
    public BlockTNTCake() {
        super();
        this.setCreativeTab(ModTab.MAIN);
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {

        world.createExplosion(null, x, y, z, 2F, true);
    }
}
