package com.pogginfloppers.lootdrop.classes.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;

import java.util.List;
import java.util.ArrayList;

public class ItemManager {
  public static ItemStack friendly_token;
  public static void init() {
    createFriendlyToken();
  }
  public static void createFriendlyToken() {
    ItemStack item = new ItemStack(Material.DIRT, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("Friendly Token");
    List<String> lore = new ArrayList<>();
    lore.add("§l§4COMMON");
    lore.add("A token of welcoming!");
    meta.setLore(lore);
    item.setItemMeta(meta);
    friendly_token = item;
  }
}