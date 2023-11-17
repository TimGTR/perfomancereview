package ru.ubrr.pr.patterns.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        User user = new User();
        user.setName("John");
        user.setAge(30);

        model.addAttribute("user", user);

        return "home";
    }
}

