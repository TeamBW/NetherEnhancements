package com.teambw.ne.common.item.misc;

import com.teambw.ne.client.gui.ModTab;
import com.teambw.ne.common.NetherEnhancements;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNetherCookie extends Item {
    public ItemNetherCookie() {
        super();
        this.setCreativeTab(ModTab.MAIN);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        int worldID = world.provider.dimensionId;

        double x = player.posX;
        double y = player.posY;
        double z = player.posZ;

        if (worldID != -1) {
            world.createExplosion(null, x, y, z, 2F, true);
        } else if (worldID == -1) {
            player.openGui(NetherEnhancements.instance, 21, player.worldObj, (int) x, (int) y, (int) z);
        }

        return itemStack;
    }
}
