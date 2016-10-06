package io.fdz.mes.item;
import io.fdz.mes.MesOfaMod;
import net.minecraft.item.Item;

    public class ItemRegistered extends Item {
        public ItemRegistered(String name) {
            setRegistryName(name);
            setUnlocalizedName(MesOfaMod.MODID + "." + name);
        }
    }

