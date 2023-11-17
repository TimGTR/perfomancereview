package ru.ubrr.pr.patterns.mediator;

class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}