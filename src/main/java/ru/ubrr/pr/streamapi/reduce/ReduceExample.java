package ru.ubrr.pr.streamapi.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> words = Arrays.asList("Stream", "API", "in", "Java");

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Сумма чисел: " + sum);


        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Максимальное число: " + max);


        String result = words.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println("Объединенная строка: " + result);


        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Произведение чисел: " + product);
    }
}
