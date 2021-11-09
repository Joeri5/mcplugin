package me.joeri.myfirstplugin;

import me.joeri.myfirstplugin.commands.*;
import me.joeri.myfirstplugin.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has started");
        Bukkit.getServer().getPluginManager().registerEvents(new JoinListener(), this);//registeerd listener bij de server
        Bukkit.getServer().getPluginManager().registerEvents(new DoorListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new FenceListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new ChestListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerleavebedListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new SheerEvent(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayermoveListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new XpbottlebreakListener(), this);

        getCommand("god").setExecutor(new GodCommand());
        getCommand("die").setExecutor(new DieCommand());
        getCommand("doorkey").setExecutor(new DoorkeyCommand());
        getCommand("chestkey").setExecutor(new ChestkeyCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("health").setExecutor(new HealthCommand());
        getCommand("hunger").setExecutor(new HungerCommand());
        getCommand("lowhealth").setExecutor(new LowhealthCommand());
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has stopped");
    }

}
