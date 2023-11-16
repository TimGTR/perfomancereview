package ru.ubrr.pr.multithreading.multithreading3;

public class HappensBeforeExample {
    private static int sharedValue = 0;
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            sharedValue = 42;
            flag = true;
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                System.out.println("waiting...");
            }
            System.out.println("Shared value: " + sharedValue);
        });

        writerThread.start();
        readerThread.start();
    }
}
// Здесь переменная flag объявлена как volatile, что гарантирует,
// что изменения этой переменной будут видны другим потокам.
//
//В этом примере "happens-before" гарантирует,
// что операция записи value = 5 будет видна другому потоку
// после установки флага flag = true. Это означает,
// что когда readerThread увидит, что флаг flag стал true,
// он также увидит значение value, установленное в потоке writerThread.
//
//Таким образом, благодаря использованию volatile и
// "happens-before" гарантируется правильный порядок операций между потоками
// для обеспечения корректной синхронизации и видимости общих данных.

