package com.teambw.ne.common.world;

import com.teambw.ne.common.block.RegisterBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {

    private Block block;
    private World world;
    private Random random;
    private int chunkX;
    private int chunkZ;
    private int minVienSize;
    private int maxVienSize;
    private int chance;
    private int minY;
    private int maxY;
    private Block generateIn;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId) {

            case 1:
                generateSky(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
                break;
            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateSky(World world, Random random, int x, int z) {

    }

    public void generateOverworld(World world, Random random, int x, int z) {

    }

    public void generateNether(World world, Random random, int x, int z) {

        generateOre(RegisterBlocks.blockOmniiteOre, world, random, x, z, 1, 5, 25, 0, 256, Blocks.netherrack);
    }

    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {

        int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
        int heightRange = maxY - minY;
        WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);

        for (int i = 0; i < chance; i++) {

            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);
            gen.generate(world, random, xRand, yRand, zRand);
        }
    }
}
