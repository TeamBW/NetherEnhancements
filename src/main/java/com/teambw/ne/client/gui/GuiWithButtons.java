package com.teambw.ne.client.gui;

import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;

public class GuiWithButtons extends GuiScreen {

    public static final int GUI_ID = 21;

    public final int xSizeOfTexture = 800;
    public final int ySizeOfTexture = 400;

    @Override
    public void drawScreen(int x, int y, float f) {

        drawDefaultBackground();

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        int posX = (this.width - xSizeOfTexture) / 2;
        int posY = (this.height - ySizeOfTexture) / 2;

        drawTexturedModalRect(posX, posY, 0, 0, xSizeOfTexture, ySizeOfTexture);

        super.drawScreen(x, y, f);
    }

    @Override
    public boolean doesGuiPauseGame() {

        return false;
    }
}
