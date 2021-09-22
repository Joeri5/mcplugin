package me.joeri.myfirstplugin;

import me.joeri.myfirstplugin.listeners.JoinListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started");
        Bukkit.getServer().getPluginManager().registerEvents(new JoinListeners(), this);//registeerd listener bij de server
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has stopped");
    }
}
