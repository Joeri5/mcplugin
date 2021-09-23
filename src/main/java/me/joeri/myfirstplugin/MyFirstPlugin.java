package me.joeri.myfirstplugin;

import me.joeri.myfirstplugin.listeners.JoinListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started");
        Bukkit.getServer().getPluginManager().registerEvents(new JoinListeners(), this);//registeerd listener bij de server
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has stopped");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // /die it kills the player
        if (command.getName().equalsIgnoreCase("die")){

            if (sender instanceof Player){

                Player player = (Player) sender;
                player.setHealth(0.0);
                player.sendMessage(ChatColor.RED + "You have chosen to die.");
            }

        } else if (command.getName().equalsIgnoreCase("doorkey")){

            if (sender instanceof Player){

                Player player = (Player) sender;
                player.getInventory().addItem(new ItemStack(Material.STICK));
            }

        } else if (command.getName().equalsIgnoreCase("chestkey")){

            if (sender instanceof Player){

                Player player = (Player) sender;
                player.getInventory().addItem(new ItemStack(Material.POTATO));
            }

        }
        return true;
    }

}
