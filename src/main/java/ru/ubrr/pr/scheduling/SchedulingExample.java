package ru.ubrr.pr.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingExample {
    @Scheduled(fixedRate = 5000)
    public void performTaskRate() {
        System.out.println("Выполняем задачу...");
    }
    @Scheduled(fixedDelay = 5000)
    public void performTaskFixedDelay() {
        System.out.println("Выполняем задачу...");
    }

    @Scheduled(initialDelay = 5000)
    public void performTaskInitialDelay() {
        System.out.println("Выполняем задачу...");
    }

    @Scheduled(initialDelay = 5000, fixedDelay = 5000)
    public void performTaskInitialFixedDelay() {
        System.out.println("Выполняем задачу...");
    }

    @Scheduled(cron = "0 0 12 * * MON-FRI")
    public void performTaskCron() {
        System.out.println("Выполняем задачу...");
    }
}
