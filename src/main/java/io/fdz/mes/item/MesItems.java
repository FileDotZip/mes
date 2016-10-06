package io.fdz.mes.item;

import io.fdz.mes.MesOfaMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MesItems {
    public static Item MesTestItem;
    public static void preInit(){
        MesTestItem = new Item().setUnlocalizedName("TestItem").setCreativeTab(MesOfaMod.creativeTab1);
        registerItems();
    }
    public static void registerItems(){
        GameRegistry.register(MesTestItem, new ResourceLocation(MesOfaMod.MODID, "TestItem1"));
    }
    public static void registerRenders(){
        registerRender(MesTestItem);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MesOfaMod.MODID + ";" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
