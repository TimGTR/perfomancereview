package ru.ubrr.pr.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello");
        if (optionalWithValue.isPresent()) {
            String value = optionalWithValue.get();
            System.out.println("Value is present: " + value);
        } else {
            System.out.println("Value is absent");
        }

        Optional<String> optionalEmpty = Optional.empty();
        String result = optionalEmpty.orElseGet(() -> "Default Value");
        System.out.println("Result: " + result);

        String nullableValue = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableValue);
        optionalNullable.ifPresent(value -> System.out.println("Value is present: " + value));
    }
}

