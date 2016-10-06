package io.fdz.mes.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab1 extends CreativeTabs{

    public CreativeTab1(int index, String label){
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.POTATO;
    }
}
