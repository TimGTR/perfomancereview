package ru.ubrr.pr.hibernate;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.ubrr.pr.hibernate")
@RequiredArgsConstructor
public class HibernateLazyEagerDemo {
    public static void main(String[] args) {
        SpringApplication.run(HibernateLazyEagerDemo.class, args);
    }
}

