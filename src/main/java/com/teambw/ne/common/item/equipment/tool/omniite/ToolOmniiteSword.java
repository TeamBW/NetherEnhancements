package com.teambw.ne.common.item.equipment.tool.omniite;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemSword;

public class ToolOmniiteSword extends ItemSword {
    public ToolOmniiteSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
