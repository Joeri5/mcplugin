package me.joeri.myfirstplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerleavebedListener implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.saveData();
        //saves the data of the player when the player leaves the bed
        player.sendMessage("You left the bed and saved your data.");
        //sends a message when the player leaves the bed
    }

}
