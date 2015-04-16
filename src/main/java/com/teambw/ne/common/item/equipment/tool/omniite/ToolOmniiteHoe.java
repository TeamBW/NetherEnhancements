package com.teambw.ne.common.item.equipment.tool.omniite;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemHoe;

public class ToolOmniiteHoe extends ItemHoe {
    public ToolOmniiteHoe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
