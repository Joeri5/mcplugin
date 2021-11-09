package me.joeri.myfirstplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class FenceListener implements Listener {

    @EventHandler
    public void fence(PlayerInteractEvent event){
        Block block = event.getClickedBlock();
        assert block != null;

        if (!block.getType().toString().contains("FENCE")) return;

        if (event.getItem() != null) {
            // ja voert hij alles hieronder uit
            Material material = event.getItem().getType();

            if (!material.equals(Material.STICK)) {
                event.setCancelled(true);
            }
            return;
        }

        // hier
        event.setCancelled(true);
    }

}
