package ru.ubrr.pr.multithreading.multithreading4;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String item : list) {
            list.remove(item);
        }
        System.out.println(list.size());
    }
}
