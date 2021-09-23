package me.joeri.myfirstplugin.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.player.*;

public class JoinListeners implements Listener {

    @EventHandler(priority = EventPriority.HIGH) //event moet als eerst uitgevoerd worden
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage("Welkom bij TestServer van @Joeri33");//message word gestuurd als de player de server joined
        event.setJoinMessage("[+] " +event.getPlayer().getName());
    }

    @EventHandler
    public void Block(PlayerInteractEvent event){
        Block block = event.getClickedBlock();
        assert block != null;

        if (!block.getType().toString().contains("DOOR")) return;

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

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        Player player = event.getPlayer();
        player.saveData();
        //saves the data of the player when the player leaves the bed
        player.sendMessage("You left the bed and saved your data.");
        //sends a message when the player leaves the bed
    }

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

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e){
        Block block = e.getHitBlock();
        if(block != null) {
            block.breakNaturally();
        }
    }
}
