package io.fdz.mes.proxy;


import io.fdz.mes.item.Items.AwesomeDebugTool;
import io.fdz.mes.item.MesItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{



    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModelLoader.setCustomModelResourceLocation(MesItems.awesomeDebugTool, 0,
                new ModelResourceLocation(MesItems.awesomeDebugTool.getRegistryName(), "inventory"));

        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {

        MesItems.registerRenders();
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
