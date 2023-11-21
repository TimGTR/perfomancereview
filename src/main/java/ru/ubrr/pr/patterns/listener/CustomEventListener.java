package ru.ubrr.pr.patterns.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Received Custom Event: " + event.getMessage());
    }
}
