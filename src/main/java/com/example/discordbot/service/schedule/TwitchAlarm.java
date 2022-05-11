package com.example.discordbot.service.schedule;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

@Slf4j
@Service
@AllArgsConstructor
public class TwitchAlarm {

    private Map<String, ScheduledFuture<?>> scheduledTasks = new ConcurrentHashMap<>();
    private final TaskScheduler taskScheduler;

    public void register() {
        ScheduledFuture<?> task = taskScheduler.scheduleAtFixedRate(() -> log.info("hello jeong-pro"), 1000);
        scheduledTasks.put("mySchedulerId", task);
    }

    public void remove() {
        scheduledTasks.get("mySchedulerId").cancel(true);
    }
}
