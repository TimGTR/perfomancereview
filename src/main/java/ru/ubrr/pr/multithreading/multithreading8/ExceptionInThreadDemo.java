package ru.ubrr.pr.multithreading.multithreading8;

public class ExceptionInThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int result = 10 / 0;
        });

        thread.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}

