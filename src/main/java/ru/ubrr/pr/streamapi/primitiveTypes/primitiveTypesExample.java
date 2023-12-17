package ru.ubrr.pr.streamapi.primitiveTypes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class primitiveTypesExample {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);


        IntStream.range(1, 10)
                .forEach(System.out::println);


        IntStream.iterate(2, (x) -> x * x)
                .limit(10)
                .forEach(System.out::println);


        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        int sum = stream.sum();
        System.out.println("Сумма чисел: " + sum);


        IntStream squared = Arrays.stream(numbers)
                .map(n -> n * n);
        squared.forEach(System.out::println);


        double[] values = {3.5, 7.2, 1.8, 9.4, 5.1};
        double max = Arrays.stream(values)
                .max()
                .orElse(Double.NaN);
        System.out.println("Максимальное значение: " + max);
    }
}
