package ru.ubrr.pr.multithreading.multithreading8;

public class ExceptionHandlingInThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}

