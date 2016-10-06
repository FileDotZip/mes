package io.fdz.mes;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MesOfaMod.MODID, version = MesOfaMod.VERSION, name = MesOfaMod.NAME)
public class MesOfaMod
{
    public static final String MODID = "mes";
    public static final String VERSION = "0.1";
    public static final String NAME = "Modular Exo Suits";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
