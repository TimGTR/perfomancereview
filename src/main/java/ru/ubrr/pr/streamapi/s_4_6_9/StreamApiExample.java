package ru.ubrr.pr.streamapi.s_4_6_9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        List<String> strings = List.of("apple", "banana", "orange", "grape");
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
