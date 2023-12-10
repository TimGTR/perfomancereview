package ru.ubrr.pr.lambda_exception;

import java.util.Arrays;
import java.util.List;

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
    }
}
