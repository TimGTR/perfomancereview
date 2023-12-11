package ru.ubrr.pr.streamapi.s_4_6_5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiExample {
    List<Integer> list = List.of(1,2,3);
    List<Integer> list1 = list.stream().collect(Collectors.toList());
    Set<Integer> set = list.stream().collect(Collectors.toSet());
    Set<Integer> hashSet = list.stream().collect(Collectors.toCollection(HashSet::new));
    Set<Integer> treeSet = list.stream().collect(Collectors.toCollection(TreeSet::new));
    Map<String, Integer> map = list.stream().collect(Collectors.toMap(String::valueOf, Function.identity()));
    Map<Integer, String> hashMap = list.stream().collect(Collectors.toMap(Function.identity(), String::valueOf, (existing, replacement) -> existing, HashMap::new));
    Map<Integer, String> treeMap = list.stream().collect(Collectors.toMap(Function.identity(), String::valueOf, (existing, replacement) -> existing, TreeMap::new));
    LinkedList<Integer> linkedList = list.stream().collect(Collectors.toCollection(LinkedList::new));
}
