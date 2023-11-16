package ru.ubrr.pr.multithreading.multithreading3;

public class Main {
    public static void main(String[] args) {
        SynchronizedExample synchronizedExample = new SynchronizedExample();

        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedExample.increment();
                System.out.println("Incremented by thread 1");
            }
        });

        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronizedExample.increment();
                System.out.println("Incremented by thread 2");
            }
        });

        incrementThread1.start();
        incrementThread2.start();

        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();

        Thread waitingThread = new Thread(() -> {
            try {
                waitNotifyExample.waitForData();
                System.out.println("Data is ready!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread preparingThread = new Thread(() -> {
            waitNotifyExample.prepareData();
            System.out.println("Data prepared.");
        });

        waitingThread.start();
        preparingThread.start();

    }
}

