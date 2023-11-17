package ru.ubrr.pr.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void sendMessage(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            if (colleague != originator) {
                colleague.receiveMessage(message);
            }
        }
    }
}
