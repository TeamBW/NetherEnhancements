package com.teambw.ne.common.item.equipment.tool.omniite;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemAxe;

public class ToolOmniiteAxe extends ItemAxe {
    public ToolOmniiteAxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
