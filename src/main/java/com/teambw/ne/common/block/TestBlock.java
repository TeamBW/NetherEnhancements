package com.teambw.ne.common.block;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestBlock extends Block {
    public TestBlock(Material material) {
        super(material);
        this.setBlockName("testBlock");
        this.setCreativeTab(ModTab.MAIN);
    }
}
