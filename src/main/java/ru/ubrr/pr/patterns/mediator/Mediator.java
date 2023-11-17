package ru.ubrr.pr.patterns.mediator;

interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
