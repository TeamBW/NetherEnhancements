package com.teambw.ne.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RegisterBlocks {

    public static final Block testBlock = new TestBlock(Material.ground);

    public static void init() {

        GameRegistry.registerBlock(testBlock, "testBlock");
    }
}
