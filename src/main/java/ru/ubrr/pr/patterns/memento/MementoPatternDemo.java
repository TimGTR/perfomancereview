package ru.ubrr.pr.patterns.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State #1");

        Memento memento = originator.saveStateToMemento();

        originator.setState("State #2");

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(memento);

        System.out.println("Restored State: " + originator.getState());
    }
}
