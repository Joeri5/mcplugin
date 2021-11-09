package me.joeri.myfirstplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ChestListener implements Listener {

    @EventHandler
    public void tp(PlayerInteractEvent event){
        Block block = event.getClickedBlock();
        assert block != null;

        if (!block.getType().toString().contains(Material.CHEST.toString()) && !block.getType().toString().contains(Material.BARREL.toString())) return;

        if (event.getItem() != null) {

            Material material = event.getItem().getType();

            if (!material.equals(Material.POTATO)) {
                event.setCancelled(true);
            }
            return;
        }
        event.setCancelled(true);
    }

}
