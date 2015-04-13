package com.teambw.ne.common.item.misc;

import com.teambw.ne.client.gui.ModTab;
import com.teambw.ne.common.item.RegisterItems;
import net.minecraft.item.Item;

public class ItemHammer extends Item {
    public ItemHammer() {
        super();
        this.setCreativeTab(ModTab.MAIN);
        this.setContainerItem(RegisterItems.itemHammer);
    }
}
