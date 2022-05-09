package com.example.discordbot.listener;

import com.example.discordbot.service.message.PingpongService;
import com.example.discordbot.service.util.Common;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class PingpongListener extends ListenerAdapter {

    private static final PingpongService pingpongService = new PingpongService();

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Common.logging(event);
        String msg = event.getMessage().getContentDisplay();

        if (msg.equals("!ping")) {
            pingpongService.send(event);
        }
    }
}