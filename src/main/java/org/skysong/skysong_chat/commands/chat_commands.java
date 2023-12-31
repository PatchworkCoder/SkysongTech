package org.skysong.skysong_chat.commands;


import cloud.commandframework.annotations.Argument;
import cloud.commandframework.annotations.CommandMethod;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.skysong.skysong_chat.Skysong_Chat;

import java.util.Arrays;

public class chat_commands {
    private Skysong_Chat plugin;

    public chat_commands(Skysong_Chat plugin) {
        this.plugin = plugin;
    }

    @CommandMethod("tableflip <name>")
    public void Tableflip (CommandSender sender, @Argument("name")String name){
        // var x = Bukkit.getOnlinePlayers(name);
       // for (Player player : x){
       //     player.sendMessage("org.skysong.skysong_chat");
       // }
    }
    @CommandMethod("volume <range>")
    public void setPlayerChatRange(CommandSender sender, @Argument("range") String range){
        // todo: get from config, do not hard code
        String[] ranges = {"global", "region", "local", "quiet"};

        if (Arrays.asList(ranges).contains(range)){
            // todo: implement the following
            //sender.sendMessage("You are now speaking in " + volume + "range!");

        }
    }

    // NUMI'S NOTE: These are for testing and demonstration.
    // You can (and should) delete these later.

    @CommandMethod("ic <msg>")
    public void test_ChatIC(CommandSender sender, @Argument("msg") String msg){
        plugin.chatHandlerService.SendChatMessage(true, msg);
    }

    @CommandMethod("ooc <msg>")
    public void test_ChatOOC(CommandSender sender, @Argument("msg") String msg){
        plugin.chatHandlerService.SendChatMessage(false, msg);
    }

}
