package com.songoda.core.nms.v1_8_R2.nbt;

import com.songoda.core.nms.nbt.NBTItem;
import net.minecraft.server.v1_8_R2.NBTTagCompound;
import org.bukkit.craftbukkit.v1_8_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class NBTItemImpl extends NBTCompoundImpl implements NBTItem {
    private final net.minecraft.server.v1_8_R2.ItemStack nmsItem;

    public NBTItemImpl(net.minecraft.server.v1_8_R2.ItemStack nmsItem) {
        super(nmsItem != null && nmsItem.hasTag() ? nmsItem.getTag() : new NBTTagCompound());

        this.nmsItem = nmsItem;
    }

    public ItemStack finish() {
        if (nmsItem == null) {
            return CraftItemStack.asBukkitCopy(net.minecraft.server.v1_8_R2.ItemStack.createStack(compound));
        }

        return CraftItemStack.asBukkitCopy(nmsItem);
    }
}
