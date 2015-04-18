package com.teambw.ne.common.world.structures;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class GeneratorNetherDungeon extends WorldGenerator {

    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {

        /*if (world.getBlock(x, y, z) != Blocks.netherrack || world.getBlock(x, y, z) != Blocks.air) {
            return false;
        }*/

        for (int x1 = 0; x1 <= 1; x1++) {
            for (int y1 = 0; y1 < 2; y1++) {
                for (int z1 = 0; z1 < 1; z1++) {
                    if ((x1 == 1) && (y1 >= 1 && y1 <= 2) && (z1 == 1)) {
                        continue;
                    }

                    world.setBlock(x, y, z, Blocks.diamond_block);
                    world.setBlock(x, y++, z, Blocks.lapis_block);
                }
            }
        }

        return true;
    }
}
