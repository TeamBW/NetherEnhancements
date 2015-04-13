package com.teambw.ne.common;

import com.teambw.ne.common.block.RegisterBlocks;
import com.teambw.ne.common.helper.LogHelper;
import com.teambw.ne.common.item.RegisterItems;
import com.teambw.ne.common.lib.LibMisc;
import com.teambw.ne.common.proxy.CommonProxy;
import com.teambw.ne.common.recipe.MiscRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibMisc.ID, name = LibMisc.NAME, version = LibMisc.VERISON)
public class NetherEnhancements {

    @Mod.Instance(value = LibMisc.ID)
    public static NetherEnhancements instance;

    @SidedProxy(clientSide = LibMisc.CLIENT_PROXY, serverSide = LibMisc.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        LogHelper.info("Pre Initialization Started");

        RegisterBlocks.init();
        RegisterItems.init();

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("Initialization Started");

        MiscRecipes.init();

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post Initialization Started");

        LogHelper.info("Post Initialization Complete");
    }
}