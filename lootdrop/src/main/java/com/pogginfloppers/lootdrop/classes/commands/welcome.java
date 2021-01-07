package com.pogginfloppers.lootdrop.classes.commands;


import com.pogginfloppers.lootdrop.classes.items.ItemManager;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class welcome implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      if (!(sender instanceof Player)) {
        sender.sendMessage("Only players can use this command!");
        return true;
      }
        Player p = (Player) sender;
        Player e = Bukkit.getPlayer(args[0]);
        String msg = "Welcome from " + 	p.getDisplayName(); 
        e.sendMessage(msg);
        e.getInventory().addItem(ItemManager.friendly_token);
        return true;
    }
}