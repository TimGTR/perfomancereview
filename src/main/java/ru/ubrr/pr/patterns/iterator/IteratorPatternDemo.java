package ru.ubrr.pr.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}

