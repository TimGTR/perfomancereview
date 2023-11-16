package ru.ubrr.pr.multithreading.multithreading8;

public class ExceptionHandlingInThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        });
        thread.start();
    }
}

