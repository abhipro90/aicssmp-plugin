package com.pogginfloppers.lootdrop;

import com.pogginfloppers.lootdrop.classes.commands.welcome;
import com.pogginfloppers.lootdrop.classes.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class lootdrop extends JavaPlugin {
    
    @Override
    public void onEnable() {
      ItemManager.init();
      getCommand("welcome").setExecutor(new welcome());
    }

    @Override
    public void onDisable() {
    }
}
