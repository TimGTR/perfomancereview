package ru.ubrr.pr.streamapi.s_4_6_6;

import java.util.ArrayList;
import java.util.List;

public class MyCustomContainer {
    private List<String> elements = new ArrayList<>();

    public void accumulate(String element) {
        elements.add(element);
    }

    public void combine(MyCustomContainer other) {
        elements.addAll(other.elements);
    }

    public List<String> getElements() {
        return elements;
    }
}
