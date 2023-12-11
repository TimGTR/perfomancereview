package ru.ubrr.pr.streamapi.s_4_6_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape");
        Map<Integer, List<String>> groupedByLength = list.stream()
                .collect(Collectors.groupingBy(String::length));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> evenOddPartition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<String> fruits = list.stream()
                .collect(Collectors.toList());

        MyCustomContainer container = list.stream()
                .collect(MyCustomContainer::new, MyCustomContainer::accumulate, MyCustomContainer::combine);
    }
}


