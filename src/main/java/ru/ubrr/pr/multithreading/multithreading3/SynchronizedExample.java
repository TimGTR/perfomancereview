package ru.ubrr.pr.multithreading.multithreading3;

public class SynchronizedExample {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }
}

