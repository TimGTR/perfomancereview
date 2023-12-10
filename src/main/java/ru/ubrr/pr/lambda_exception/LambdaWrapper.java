package ru.ubrr.pr.lambda_exception;

import java.util.function.Consumer;

interface LambdaWrapper {
    static Consumer<String> lambdaWrapper(Consumer<String> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (NumberFormatException e) {
                System.err.println(
                        "NumberFormatException occured : " + e.getMessage());
            }
        };
    }
}
