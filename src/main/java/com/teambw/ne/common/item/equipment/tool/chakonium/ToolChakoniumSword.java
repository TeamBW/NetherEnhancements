package com.teambw.ne.common.item.equipment.tool.chakonium;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemSword;

public class ToolChakoniumSword extends ItemSword {
    public ToolChakoniumSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
