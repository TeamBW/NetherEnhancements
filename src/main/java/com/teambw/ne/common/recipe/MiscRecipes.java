package com.teambw.ne.common.recipe;

import com.teambw.ne.common.block.RegisterBlocks;
import com.teambw.ne.common.item.RegisterItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MiscRecipes {
    public static void init() {
        shapedRecipes();
        shapelessRecipes();
    }

    public static void shapedRecipes() {

        GameRegistry.addShapedRecipe(new ItemStack(RegisterItems.itemUnstableBlazePowder, 8), "ABA", "BAB", "ABA", 'A', new ItemStack(RegisterItems.itemActivatedBlazePowder), 'B', new ItemStack(Items.blaze_powder));
        GameRegistry.addShapedRecipe(new ItemStack(RegisterItems.itemChunkOfDarkBlazePowder, 8), "AAA", "ACA", "AAA", 'A', new ItemStack(RegisterItems.itemActivatedBlazePowder), 'C', new ItemStack(RegisterItems.itemChunkOfObsidian));

        //Tools
        GameRegistry.addShapedRecipe(new ItemStack(RegisterItems.toolOmniiteSword), " O ", " O ", " S ", 'O', new ItemStack(RegisterItems.itemOmniiteGem), 'S', new ItemStack(Items.stick));
    }

    public static void shapelessRecipes() {

        GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.itemOmniiteGem), new ItemStack(RegisterBlocks.blockOmniiteOre), new ItemStack(RegisterItems.itemUnstableBlazePowder));
        GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.itemChunkOfObsidian, 8), new ItemStack(RegisterItems.itemHammer), new ItemStack(Item.getItemFromBlock(Blocks.obsidian)));
        GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.itemDarkBlazePowder, 8), new ItemStack(RegisterItems.itemChunkOfDarkBlazePowder), new ItemStack(RegisterItems.itemHammer));
        GameRegistry.addShapelessRecipe(new ItemStack(RegisterItems.itemChakoniumGem), new ItemStack(RegisterItems.itemOmniiteGem), new ItemStack(RegisterItems.itemDarkBlazePowder));
    }
}
