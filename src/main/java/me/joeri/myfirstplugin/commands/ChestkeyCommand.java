package me.joeri.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ChestkeyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;
            p.getInventory().addItem(new ItemStack(Material.POTATO));
            p.sendMessage(ChatColor.GREEN + "You were given a chestkey.");

        }

        return true;
    }
}
