package io.fdz.mes.proxy;


import io.fdz.mes.MesOfaMod;
import io.fdz.mes.item.MesItems;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        GameRegistry.register(MesItems.awesomeDebugTool.setCreativeTab(MesOfaMod.creativeTab1));
    }
    public void init(FMLInitializationEvent event){

    }
    public void postInit(FMLPostInitializationEvent event){

    }

}
