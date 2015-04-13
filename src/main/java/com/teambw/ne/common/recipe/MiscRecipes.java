package com.teambw.ne.common.recipe;

import com.teambw.ne.common.item.RegisterItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MiscRecipes {
    public static void init() {

        GameRegistry.addShapedRecipe(new ItemStack(RegisterItems.coldBlazePowderItem), "WSW", "SBS", "WSW", 'W', new ItemStack(Items.water_bucket), 'S', new ItemStack(Item.getItemFromBlock(Blocks.snow)), 'B', new ItemStack(Items.blaze_powder));
        GameRegistry.addShapedRecipe(new ItemStack(RegisterItems.coldBlazePowderItem), "WIW", "IBI", "WIW", 'W', new ItemStack(Items.water_bucket), 'I', new ItemStack(Item.getItemFromBlock(Blocks.ice)), 'B', new ItemStack(Items.blaze_powder));
    }
}
