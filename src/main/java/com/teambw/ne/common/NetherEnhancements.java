package com.teambw.ne.common;

import com.teambw.ne.client.gui.GuiHandler;
import com.teambw.ne.common.block.RegisterBlocks;
import com.teambw.ne.common.entity.EntityRectangleDeath;
import com.teambw.ne.common.handler.DropHandler;
import com.teambw.ne.common.helper.LogHelper;
import com.teambw.ne.common.item.RegisterItems;
import com.teambw.ne.common.lib.LibMisc;
import com.teambw.ne.common.proxy.CommonProxy;
import com.teambw.ne.common.recipe.MiscRecipes;
import com.teambw.ne.common.world.OreGeneration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraftforge.common.MinecraftForge;

import java.util.Random;

@Mod(modid = LibMisc.ID, name = LibMisc.NAME, version = LibMisc.VERISON)
public class NetherEnhancements {

    @Mod.Instance(value = LibMisc.ID)
    public static NetherEnhancements instance;

    @SidedProxy(clientSide = LibMisc.CLIENT_PROXY, serverSide = LibMisc.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        LogHelper.info("Pre Initialization Started");

        RegisterBlocks.preInit();
        RegisterItems.preInit();

        GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);

        registerEntity(EntityRectangleDeath.class, "entityRectangleDeath");

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("Initialization Started");

        MiscRecipes.init();
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        proxy.registerKeyBindings();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Started");

        LogHelper.info("Post Initialization Complete");
    }

    public static void registerEntity(Class entityClass, String name) {

        int entityId = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);

        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
        EntityRegistry.registerModEntity(entityClass, name, entityId, instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, primaryColor, secondaryColor));
    }
}
