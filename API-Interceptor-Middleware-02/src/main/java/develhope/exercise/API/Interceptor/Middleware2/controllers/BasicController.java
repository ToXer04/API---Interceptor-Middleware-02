package develhope.exercise.API.Interceptor.Middleware2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class BasicController {
    @GetMapping("")
    public String welcomeUser() {
        return "Welcome!";
    }
}
