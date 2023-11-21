package ru.ubrr.pr.aop;

import org.springframework.stereotype.Service;

@Service
public class ServiceDemoForAOP {
    public String loading() {
        System.out.println("Loading...");
        return "Result from service";
    }
}
