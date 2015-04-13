package com.teambw.ne.common.handler;

import com.teambw.ne.common.item.RegisterItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import java.util.Random;

public class DropHandler {

    public static Random random;
    public static int dropped;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        random = new Random();
        dropped = random.nextInt(1) + 1;

        if (event.entityLiving instanceof EntityBlaze) {
            event.entityLiving.entityDropItem(new ItemStack(RegisterItems.itemActivatedBlazePowder), dropped);
        }
    }
}
