package org.skysong.skysong_chat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Skysong_Chat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello from Vega!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
