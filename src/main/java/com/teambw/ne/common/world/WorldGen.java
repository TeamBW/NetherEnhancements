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
            case -1: generateNether(world, random, chunkX*16, chunkZ*16);
                break;
            case 0: generateOverworld(world, random, chunkX*16, chunkZ*16);
                break;
        }
    }

    private void generateNether(World world, Random random, int blockX, int blockZ) {

        int Xcoordl = blockX + random.nextInt(16);
        int Ycoordl = random.nextInt(80);
        int Zcoordl = blockZ + random.nextInt(16);

        (new GeneratorNetherDungeon()).generate(world, random, 500, 100, 500);
    }

    private void generateOverworld(World world, Random random, int blockX, int blockZ) {

        int Xcoordl = blockX + random.nextInt(16);
        int Ycoordl = random.nextInt(80);
        int Zcoordl = blockZ + random.nextInt(16);

        (new GeneratorNetherDungeon()).generate(world, random, 500, 100, 500);
    }
}
