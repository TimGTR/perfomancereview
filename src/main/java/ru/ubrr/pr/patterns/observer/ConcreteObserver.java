package ru.ubrr.pr.patterns.observer;

class ConcreteObserver implements Observer {
    private final ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        System.out.println("State changed, new state: " + subject.getState());
    }
}

