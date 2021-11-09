package me.joeri.myfirstplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){

            Player p = (Player) sender;
            if(p.hasPermission("testing1.feed")) {

                p.setFoodLevel(20);
                p.sendMessage(ChatColor.GREEN + "You have eaten.");

            }else{
                p.sendMessage(ChatColor.RED + "You do not have the required permissions(testing1.feed) to execute this command.");
            }


        }else{
            System.out.println(ChatColor.RED+"You need to be a player to execute this command.");
        }

        return true;
    }
}
