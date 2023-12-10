package ru.ubrr.pr.lambda_exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static ru.ubrr.pr.lambda_exception.LambdaWrapper.lambdaWrapper;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "four", "5");

        numbers.forEach(number -> {
            try {
                int parsedNumber = Integer.parseInt(number);
                System.out.println("Parsed number: " + parsedNumber);
            } catch (NumberFormatException e) {
                System.err.println("Error parsing number: " + number);
            }
        });


        numbers.forEach(lambdaWrapper(i ->
                System.out.println("Parsed number: " + Integer.parseInt(i))
        ));

    }
}
