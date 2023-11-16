package ru.ubrr.pr.multithreading.multithreading7;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable taskRunnable = new MyRunnable();
        Thread thread = new Thread(taskRunnable);
        thread.start();

        Callable<String> taskCallable = new MyCallable();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(taskCallable);

        String result = future.get();
        System.out.println("Result: " + result);

        executor.submit(taskRunnable);

        executor.shutdown();
    }
}
