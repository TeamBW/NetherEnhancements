package com.teambw.ne.common.block.misc;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block {
    public BlockTest(Material material) {
        super(material);
        this.setCreativeTab(ModTab.MAIN);
    }
}
