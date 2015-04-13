package com.teambw.ne.common.item;

import com.teambw.ne.common.item.misc.ColdBlazePowderItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class RegisterItems {

    public static Item netherCookieItem = new NetherCookieItem();
    public static Item coldBlazePowderItem = new ColdBlazePowderItem();

    public static void init() {

        GameRegistry.registerItem(netherCookieItem, "netherCookieItem");
        GameRegistry.registerItem(coldBlazePowderItem, "coldBlazePowderItem");
    }
}
