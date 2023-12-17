package ru.ubrr.pr.funcInterfaces;

import java.util.function.*;

public class funcInterfacesExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-2));

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        Function<Integer, String> convertToString = num -> "Number: " + num;
        String result = convertToString.apply(10);
        System.out.println(result);

        Supplier<Double> randomValue = () -> Math.random();
        double value = randomValue.get();
        System.out.println(value);

        UnaryOperator<Integer> square = num -> num * num;
        int squaredValue = square.apply(5);
        System.out.println(squaredValue);

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        int resultSum = sum.apply(10, 20);
        System.out.println(resultSum);
    }
}
