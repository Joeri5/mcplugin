package me.joeri.myfirstplugin.listeners;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpbottlebreakListener implements Listener {

    @EventHandler
    public void onXPBottleBreak(ExpBottleEvent e){
        Block block = e.getHitBlock();
        if(block != null) {
            block.breakNaturally();
        }
    }

}
