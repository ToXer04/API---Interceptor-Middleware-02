package develhope.exercise.API.Interceptor.Middleware2.controllers;

import develhope.exercise.API.Interceptor.Middleware2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @GetMapping("")
    public Month getMonth(HttpServletRequest request) {
        return (Month) request.getAttribute("monthNumber");
    }
}
