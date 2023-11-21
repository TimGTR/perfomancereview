package ru.ubrr.pr.aop;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final ServiceDemoForAOP service;

    @GetMapping("/aop")
    String start() {
        return service.loading();
    }
}
