package org.skysong.skysong_chat.listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat_Listener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        event.setCancelled(true);
        var players = Bukkit.getOnlinePlayers();
        for (Player player : players){
            //Colors for chat: #f7d472
            player.sendMessage(
                    //this sets the code color to #f7d472 and leaves the display name alone
                    ChatColor.of("#f7d472") +
                            "[RP]" +
                            event.getPlayer().getDisplayName() +
                    ": " + ChatColor.of("#f7d472") +
                    "[RP]" +  event.getMessage()
            );
        }

    }

}
