package com.example.discordbot.service.util;

import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@Slf4j
public class Common {

    public static void logging(@NotNull MessageReceivedEvent event) {
        Guild guild = event.getGuild();
        TextChannel textChannel = event.getTextChannel();
        Member member = event.getMember();
        Message message = event.getMessage();

        log.info("[{}][{}][{}]: {}", guild.getName(), textChannel.getName(), Objects.requireNonNull(member).getEffectiveName(), message.getContentDisplay());
    }
}