package com.teambw.ne.common.world.structures;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GeneratorNetherDungeon extends WorldGenerator {

    protected Block[] getValidSpawnBlocks() {
        return new Block[] {
                Blocks.dirt, Blocks.grass, Blocks.stone
        };
    }

    public boolean locationIsValidSpawn(World world, int x, int y, int z) {

        int distanceToAir = 0;
        Block check = world.getBlock(x, y, z);

        while (check != Blocks.air) {
            if (distanceToAir > 3) {
                return false;
            }

            distanceToAir++;
            check = world.getBlock(x, y + distanceToAir, z);
        }

        y += distanceToAir -1;

        Block block = world.getBlock(x, y, z);
        Block blockAbove = world.getBlock(x, y + 1, z);
        Block blockBelow = world.getBlock(x, y - 1, z);

        for (Block i : getValidSpawnBlocks()) {
            if (blockAbove != Blocks.air) {
                return false;
            }
            if (block == i) {

            } else if (block == Blocks.snow && blockBelow == i) {
                return true;
            }
        }
        return false;
    }

    public GeneratorNetherDungeon() {}

    @Override
    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_) {
        return false;
    }
}
