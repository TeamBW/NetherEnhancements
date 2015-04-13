package com.teambw.ne.client.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModTab {

    public static final CreativeTabs MAIN = new CreativeTabs("ne") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.nether_brick);
        }
    };
}
