package ru.ubrr.pr.hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ubrr.pr.hibernate.service.ServiceDemo;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final ServiceDemo serviceDemo;
    @GetMapping("/demo")
    void demo() {
        serviceDemo.demo();
    }
}
