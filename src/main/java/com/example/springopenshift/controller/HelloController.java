package com.example.springopenshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloController {
        @GetMapping("/hello-world")
        public String HelloWorld() {
            return "Hello world test reload auto";
        }

}
