package com.teambw.ne.common.item;

import com.teambw.ne.common.item.equipment.tool.omniite.*;
import com.teambw.ne.common.item.gem.ItemChakoniumGem;
import com.teambw.ne.common.item.gem.ItemOmniiteGem;
import com.teambw.ne.common.item.misc.*;
import com.teambw.ne.common.lib.LibToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.*;

public class RegisterItems {

    public static Item itemNetherCookie, itemActivatedBlazePowder, itemUnstableBlazePowder, itemOmniiteGem,
            itemHammer, itemChunkOfObsidian, itemDarkBlazePowder, itemChunkOfDarkBlazePowder, itemChakoniumGem;

    public static ItemSword toolOmniiteSword;

    public static ItemPickaxe toolOmniitePickaxe;

    public static ItemSpade toolOmniiteShovel;

    public static ItemAxe toolOmniiteAxe;

    public static ItemHoe toolOmniiteHoe;

    public static void preInit() {

        itemNetherCookie = registerItem("itemNetherCookie", new ItemNetherCookie());
        itemActivatedBlazePowder = registerItem("itemActivatedBlazePowder", new ItemActivatedBlazePowder());
        itemUnstableBlazePowder = registerItem("itemUnstableBlazePowder", new ItemUnstableBlazePowder());
        itemOmniiteGem = registerItem("itemOmniiteGem", new ItemOmniiteGem());
        itemHammer = registerItem("itemHammer", new ItemHammer());
        itemChunkOfObsidian = registerItem("itemChunkOfObsidian", new ItemChunkOfObsidian());
        itemDarkBlazePowder = registerItem("itemDarkBlazePowder", new ItemDarkBlazePowder());
        itemChunkOfDarkBlazePowder = registerItem("itemChunkOfDarkBlazePowder", new ItemChunkOfDarkBlazePowder());
        itemChakoniumGem = registerItem("itemChakoniumGem", new ItemChakoniumGem());

        toolOmniiteSword = registerItem("toolOmniiteSword", new ToolOmniiteSword(LibToolMaterials.OMNIITE));

        toolOmniitePickaxe = registerItem("toolOmniitePickaxe", new ToolOmniitePickaxe(LibToolMaterials.OMNIITE));

        toolOmniiteShovel = registerItem("toolOmniiteShovel", new ToolOmniiteShovel(LibToolMaterials.OMNIITE));

        toolOmniiteAxe = registerItem("toolOmniiteAxe", new ToolOmniiteAxe(LibToolMaterials.OMNIITE));

        toolOmniiteHoe = registerItem("toolOmniiteHoe", new ToolOmniiteHoe(LibToolMaterials.OMNIITE));
    }

    private static <T extends Item> T registerItem(String name, T item) {

        item.setUnlocalizedName(name);
        GameRegistry.registerItem(item, name);

        return item;
    }
}
