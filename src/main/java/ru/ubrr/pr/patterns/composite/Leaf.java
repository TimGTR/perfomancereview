package ru.ubrr.pr.patterns.composite;

class Leaf implements Component {
    public void operation() {
        System.out.println("Leaf operation");
    }
}