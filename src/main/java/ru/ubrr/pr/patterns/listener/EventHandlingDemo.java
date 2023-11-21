package ru.ubrr.pr.patterns.listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventHandlingDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CustomEventListener.class, EventPublisher.class);
        context.refresh();

        EventPublisher eventPublisher = context.getBean(EventPublisher.class);
        eventPublisher.publishCustomEvent("Hello, Spring Events!");
    }
}
