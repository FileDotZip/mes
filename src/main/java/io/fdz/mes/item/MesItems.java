package io.fdz.mes.item;

import io.fdz.mes.MesOfaMod;
import io.fdz.mes.item.Items.AwesomeDebugTool;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MesItems {
    public static final Item awesomeDebugTool = new AwesomeDebugTool("awesome_debug_tool");
    public static void preInit(){

    }
    public static void registerItems(){

    }
    public static void registerRenders(){
        registerRender(awesomeDebugTool);
    }
    public static void registerRender(Item item){
        //awesomeDebugTool = new Item().setUnlocalizedName("TestItem").setCreativeTab(MesOfaMod.creativeTab1);
        registerItems();
    }
}
