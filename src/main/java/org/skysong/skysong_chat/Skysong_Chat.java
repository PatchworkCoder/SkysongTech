package org.skysong.skysong_chat;

import com.bergerkiller.bukkit.common.cloud.CloudSimpleHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.skysong.skysong_chat.commands.chat_commands;
import org.skysong.skysong_chat.listeners.Chat_Listener;
import org.skysong.skysong_chat.services.ChatHandlerService;

public final class Skysong_Chat extends JavaPlugin {
    private CloudSimpleHandler cmdHandler = new CloudSimpleHandler();
    public ChatHandlerService chatHandlerService = new ChatHandlerService(this);

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello from Vega!");
        getServer().getPluginManager().registerEvents(new Chat_Listener(), this);
         cmdHandler.enable(this);
         cmdHandler.getParser().parse(new chat_commands(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
