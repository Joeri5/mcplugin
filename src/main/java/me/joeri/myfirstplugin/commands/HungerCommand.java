package me.joeri.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HungerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;
            p.setFoodLevel(1);
            p.sendMessage(ChatColor.RED + "You have chosen to be hungry, go and eat.");

        }

        return true;
    }
}
