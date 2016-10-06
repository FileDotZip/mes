package io.fdz.mes;

import io.fdz.mes.item.MesItems;
import io.fdz.mes.proxy.CommonProxy;
import io.fdz.mes.tab.CreativeTab1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MesOfaMod.MODID, version = MesOfaMod.VERSION, name = MesOfaMod.NAME)
public class MesOfaMod
{
    public static final String MODID = "mes";
    public static final String VERSION = "0.1";
    public static final String NAME = "Modular Exo Suits";

    @SidedProxy(clientSide = "io.fdz.mes.proxy.ClientProxy" , serverSide = "io.fdz.mes.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MesOfaMod instance;
    public static CreativeTab1 creativeTab1;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        creativeTab1 = new CreativeTab1(CreativeTabs.getNextID(),"Modular Exo Suits");
        proxy.preInit(event);
        MesItems.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Horay im initialized!");
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);

    }
}
