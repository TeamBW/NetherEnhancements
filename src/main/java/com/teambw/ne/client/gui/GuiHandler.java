package com.teambw.ne.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if (ID == TestGUI.GUI_ID) {
            return new TestGUI();
        } else if (ID == GuiWithButtons.GUI_ID) {
            return new GuiWithButtons();
        }

        return null;
    }
}
