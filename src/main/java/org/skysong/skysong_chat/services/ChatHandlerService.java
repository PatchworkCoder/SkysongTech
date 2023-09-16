package org.skysong.skysong_chat.services;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.skysong.skysong_chat.Skysong_Chat;

public class ChatHandlerService {
    private Skysong_Chat plugin;

    public ChatHandlerService(Skysong_Chat plugin) {
        this.plugin = plugin;
    }

    public void SendChatMessage(boolean isIC, String msg){
        var players = Bukkit.getOnlinePlayers();
        for (Player player: players){
            if (isIC){
                player.sendMessage(ChatColor.of("#f7d472") + "[IC]" + ChatColor.RESET + player.getDisplayName() +": " + ChatColor.of("#f7d472") + msg);
            }
            else{
                player.sendMessage(ChatColor.AQUA + "[OOC]" + ChatColor.RESET + player.getName() +": " + ChatColor.AQUA + msg);
            }
        }

    }
}
