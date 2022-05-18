package com.example.discordbot.controller;

import com.example.discordbot.service.message.PingpongService;
import com.example.discordbot.service.util.Common;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@NoArgsConstructor
public class MessageListener extends ListenerAdapter {

    PingpongService pingpongService;

    @Autowired
    public MessageListener(PingpongService pingpongService) {
        this.pingpongService = pingpongService;
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Common.logging(event);
        String msg = event.getMessage().getContentDisplay();

        if (msg.equals("!ping")) {
            pingpongService.send(event);
        }
    }
}