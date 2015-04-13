package com.teambw.ne.common.block;

import com.teambw.ne.common.block.misc.BlockTest;
import com.teambw.ne.common.block.ore.BlockOmniiteOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegisterBlocks {

    public static Block blockTest, blockOmniiteOre;

    public static void preInit() {

        blockTest = registerBlock("blockTest", new BlockTest(Material.ground));
        blockOmniiteOre = registerBlock("blockOmniiteOre", new BlockOmniiteOre(Material.rock));
    }

    private static <T extends Block> T registerBlock(String name, T block) {

        block.setBlockName(name);
        GameRegistry.registerBlock(block, name);

        return block;
    }
}
