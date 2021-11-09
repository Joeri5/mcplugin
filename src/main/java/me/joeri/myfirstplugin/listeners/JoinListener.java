package me.joeri.myfirstplugin.listeners;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class JoinListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH) //event moet als eerst uitgevoerd worden
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage("Welkom bij TestServer van @Joeri33");//message word gestuurd als de player de server joined
        event.setJoinMessage("[+] " +event.getPlayer().getName());
    }
}