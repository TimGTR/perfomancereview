package ru.ubrr.pr.multithreading.multithreading5;

public class SynchronizedMethodExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        SynchronizedMethodExample example = new SynchronizedMethodExample();

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

