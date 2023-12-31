package ru.ubrr.pr.capture_and_noncapture_lambda;

import java.util.concurrent.atomic.AtomicInteger;

public class CapturingLambdaExample {
    public static void main(String[] args) {
        int x = 5;
        //Non capture
        Runnable runnable = () -> System.out.println("Non-capturing lambda: ");
        runnable.run();
        //Capture
        Runnable runnable2 = () -> {
            System.out.println("Capturing lambda: " + x);
        };
        runnable2.run();

        System.out.println(x * 5);
    }
}
