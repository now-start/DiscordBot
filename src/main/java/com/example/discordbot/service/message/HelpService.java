package com.example.discordbot.service.message;

import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class HelpService {
    public void send(MessageReceivedEvent event) {
        MessageChannel channel = event.getChannel();
        channel.sendMessage("help!").queue();
    }
}
