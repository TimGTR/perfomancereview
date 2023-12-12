package ru.ubrr.pr.listener;

import org.springframework.context.ApplicationEvent;

class CustomEvent extends ApplicationEvent {
    private final String message;

    public CustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }




    public String getMessage() {
        return message;
    }
}

