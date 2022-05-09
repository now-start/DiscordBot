package com.example.discordbot.service.message;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

public class PingpongService {

    public void send(@NotNull MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        channel.sendMessage("pong!").queue();
    }
}