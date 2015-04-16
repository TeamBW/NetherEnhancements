package com.teambw.ne.common.item.equipment.tool.omniite;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemSpade;

public class ToolOmniiteShovel extends ItemSpade {
    public ToolOmniiteShovel(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
