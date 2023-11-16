package ru.ubrr.pr.multithreading.multithreading5;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        AtomicExample example = new AtomicExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.increment();
                System.out.println("Incremented by thread 1: " + example.count);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.increment();
                System.out.println("Incremented by thread 2: " + example.count);
            }
        });

        thread1.start();
        thread2.start();
    }
}

