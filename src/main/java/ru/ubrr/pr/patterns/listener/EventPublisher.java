package ru.ubrr.pr.patterns.listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class EventPublisher {
    private final AnnotationConfigApplicationContext context;

    public EventPublisher(AnnotationConfigApplicationContext context) {
        this.context = context;
    }

    public void publishCustomEvent(String message) {
        context.publishEvent(new CustomEvent(this, message));
    }
}
