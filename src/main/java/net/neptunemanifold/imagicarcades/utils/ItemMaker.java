package net.neptunemanifold.imagicarcades.utils;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemMaker {
    public static ItemStack newItem(ItemStack is, String name){
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(name);
        im.addItemFlags(ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_POTION_EFFECTS);

        is.setItemMeta(im);
        return is;
    }
    public static ItemStack newItem(ItemStack is, String name, Enchantment enchant){
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(name);
        im.addEnchant(enchant, 1, true);
        im.addItemFlags(ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_POTION_EFFECTS);

        is.setItemMeta(im);
        return is;
    }
    public static ItemStack newItem(ItemStack is, String name, Enchantment enchant, int CustomModelData){
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(name);
        im.setCustomModelData(CustomModelData);
        im.addEnchant(enchant, 1, true);
        im.addItemFlags(ItemFlag.HIDE_DESTROYS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_DYE, ItemFlag.HIDE_POTION_EFFECTS);

        is.setItemMeta(im);
        return is;
    }
}
