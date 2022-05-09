package com.example.discordbot.config;

import com.example.discordbot.listener.PingpongListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.security.auth.login.LoginException;

@Configuration
public class BotConfig {

    @Value("${token}")
    private String token;

    @Bean
    public void init() throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault(token)
                .addEventListeners(new PingpongListener())
                .build();
        jda.awaitReady();
    }
}
