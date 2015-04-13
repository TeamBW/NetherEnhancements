package com.teambw.ne.common.block.ore;

import com.teambw.ne.client.gui.ModTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOmniiteOre extends Block {
    public BlockOmniiteOre(Material material) {
        super(material);
        this.setStepSound(soundTypePiston);
        this.setResistance(2.0F);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(ModTab.MAIN);
    }
}
