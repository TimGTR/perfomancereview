package ru.ubrr.pr.multithreading.multithreading5;

public class SynchronizedBlockExample {
    private int count = 0;
    private final Object lock = new Object();

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public static void main(String[] args) {
        SynchronizedBlockExample example = new SynchronizedBlockExample();

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

