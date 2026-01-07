package com.work.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloWordController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
