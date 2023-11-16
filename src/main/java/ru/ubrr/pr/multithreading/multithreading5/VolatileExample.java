package ru.ubrr.pr.multithreading.multithreading5;

public class VolatileExample {
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.toggleFlag();
                System.out.println("Toggled by thread 1: " + example.flag);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.toggleFlag();
                System.out.println("Toggled by thread 2: " + example.flag);
            }
        });

        thread1.start();
        thread2.start();
    }
}

