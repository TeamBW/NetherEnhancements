package com.teambw.ne.common.item.equipment.tool.chakonium;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.item.ItemPickaxe;

public class ToolChakoniumPickaxe extends ItemPickaxe {
    public ToolChakoniumPickaxe(ToolMaterial material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
