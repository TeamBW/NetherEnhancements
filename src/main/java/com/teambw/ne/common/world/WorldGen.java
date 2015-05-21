package com.teambw.ne.common.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int x2 = 0;
        int y2 = 100;
        int z2 = 0;

        world.setBlock(x2, y2, z2, Blocks.diamond_block);
        world.setBlock(x2-1, y2, z2, Blocks.obsidian);
        world.setBlock(x2+1, y2, z2, Blocks.obsidian);
        world.setBlock(x2, y2-1, z2, Blocks.obsidian);
        world.setBlock(x2, y2+1, z2, Blocks.obsidian);
        world.setBlock(x2, y2, z2-1, Blocks.obsidian);
        world.setBlock(x2, y2, z2+1, Blocks.obsidian);
        world.setBlock(x2-1, y2-1, z2, Blocks.obsidian);
        world.setBlock(x2+1, y2-1, z2, Blocks.obsidian);
        world.setBlock(x2+1, y2+1, z2, Blocks.obsidian);
        world.setBlock(x2-1, y2+1, z2, Blocks.obsidian);
        world.setBlock(x2, y2+1, z2-1, Blocks.obsidian);
        world.setBlock(x2, y2-1, z2-1, Blocks.obsidian);
        world.setBlock(x2, y2+1, z2+1, Blocks.obsidian);
        world.setBlock(x2, y2-1, z2+1, Blocks.obsidian);
        world.setBlock(x2+1, y2, z2-1, Blocks.obsidian);
        world.setBlock(x2-1, y2, z2-1, Blocks.obsidian);
        world.setBlock(x2+1, y2, z2+1, Blocks.obsidian);
        world.setBlock(x2-1, y2, z2+1, Blocks.obsidian);
    }
}
