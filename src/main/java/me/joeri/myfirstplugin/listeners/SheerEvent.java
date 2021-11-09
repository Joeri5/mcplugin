package me.joeri.myfirstplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheerEvent implements Listener {

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        Entity entity = e.getEntity();
        if (entity.getType() == EntityType.SHEEP){
            e.setCancelled(true);
            player.sendMessage("You cannot sheer a sheep.");
        }else{
            player.sendMessage("This is not a sheep.");
        }
    }

}
