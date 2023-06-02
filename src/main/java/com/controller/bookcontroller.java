package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class bookcontroller {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
