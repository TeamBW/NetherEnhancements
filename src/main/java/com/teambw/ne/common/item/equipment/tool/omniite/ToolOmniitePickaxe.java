package com.teambw.ne.common.item.equipment.tool.omniite;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemPickaxe;

public class ToolOmniitePickaxe extends ItemPickaxe {
    public ToolOmniitePickaxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
