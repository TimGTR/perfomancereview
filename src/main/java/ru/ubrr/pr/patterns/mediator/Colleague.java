package ru.ubrr.pr.patterns.mediator;

abstract class Colleague {
    protected final Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
