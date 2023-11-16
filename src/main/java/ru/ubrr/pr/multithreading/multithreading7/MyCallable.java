package ru.ubrr.pr.multithreading.multithreading7;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public String call() {
        return "Result of Callable task";
    }
}
