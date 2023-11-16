package ru.ubrr.pr.multithreading.multithreading6;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();

        Thread thread = new Thread(() -> {
            System.out.println("Initial State: " + Thread.currentThread().getState()); // Начальное состояние - NEW

            synchronized (lock) {
                System.out.println("Acquired lock: " + Thread.currentThread().getState()); // Состояние после блокировки - RUNNABLE

                try {
                    lock.wait(100);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Before start(): " + thread.getState());

        thread.start();
        Thread.sleep(50);
        System.out.println("After start() but not locked yet: " + thread.getState());

        synchronized (lock) {
            Thread.sleep(100);
            System.out.println("After locking the object: " + thread.getState());
            lock.notify();
        }

        Thread.sleep(100);
        System.out.println("After notifying: " + thread.getState());

        synchronized (lock) {
            lock.notify();
        }

        thread.join();
        System.out.println("After join(): " + thread.getState());
    }
}



