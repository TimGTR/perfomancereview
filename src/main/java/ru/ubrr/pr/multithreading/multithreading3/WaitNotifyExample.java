package ru.ubrr.pr.multithreading.multithreading3;

public class WaitNotifyExample {
    private final Object lock = new Object();
    private boolean isDataReady = false;

    public void waitForData() throws InterruptedException {
        synchronized (lock) {
            while (!isDataReady) {
                lock.wait();
            }
        }
    }

    public void prepareData() {
        synchronized (lock) {
            isDataReady = true;
            lock.notify();
        }
    }
}

