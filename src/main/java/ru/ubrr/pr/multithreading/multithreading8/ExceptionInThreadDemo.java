package ru.ubrr.pr.multithreading.multithreading8;

public class ExceptionInThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int result = 10 / 0;
        });

        thread.start();
    }
}

