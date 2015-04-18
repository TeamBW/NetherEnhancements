package com.teambw.ne.common.item.equipment.tool.chakonium;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemSpade;

public class ToolChakoniumShovel extends ItemSpade {
    public ToolChakoniumShovel(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
