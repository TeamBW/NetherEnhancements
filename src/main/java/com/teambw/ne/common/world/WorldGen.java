package com.teambw.ne.common.world;

import com.teambw.ne.common.world.structures.GeneratorNetherDungeon;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class WorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId) {

            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
                break;
            case 1:
                generateSky(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateNether(World world, Random random, int x, int z) {

        int Xcoord1 = x + random.nextInt(16);
        int Ycoord1 = random.nextInt(60);
        int Zcoord1 = z + random.nextInt(16);

        (new GeneratorNetherDungeon()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
    }

    public void generateOverworld(World world, Random random, int x, int z) {

    }

    public void generateSky(World world, Random random, int x, int z) {

    }
}
