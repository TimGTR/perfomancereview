package ru.ubrr.pr.patterns.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
