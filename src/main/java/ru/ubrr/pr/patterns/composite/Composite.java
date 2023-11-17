package ru.ubrr.pr.patterns.composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}
