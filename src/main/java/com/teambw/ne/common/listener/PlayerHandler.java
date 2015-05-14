package com.teambw.ne.common.listener;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class PlayerHandler {

    @SubscribeEvent
    public void onJoin(EntityJoinWorldEvent event) {
        EntityPlayer player = event.world.getPlayerEntityByName(event.toString());
    }
}
