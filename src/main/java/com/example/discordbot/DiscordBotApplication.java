package com.example.discordbot;

import com.example.discordbot.listener.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.LoginException;

@SpringBootApplication
public class DiscordBotApplication {

    public static void main(String[] args) throws LoginException, InterruptedException {
        SpringApplication.run(DiscordBotApplication.class, args);

        JDA jda = JDABuilder.createDefault(args[0])
                .addEventListeners(new MessageListener())
                .build();
        jda.awaitReady();
    }

}
