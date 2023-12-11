package ru.ubrr.pr.streamapi.s_4_6_8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApiExample {
    List<String> list = List.of("apple", "banana", "orange", "grape");

    Optional<String> anyElement = list.stream().findAny();
    Optional<String> firstElement = list.stream().findFirst();

    boolean anyMatch = list.stream().anyMatch(element -> element.contains("apple"));
    boolean allMatch = list.stream().allMatch(element -> element.length() > 3);
    boolean noneMatch = list.stream().noneMatch(element -> element.equals("banana"));

    Optional<String> maxElement = list.stream().max(Comparator.naturalOrder());
    Optional<String> minElement = list.stream().min(Comparator.naturalOrder());
}
