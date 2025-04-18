package com.cts.SmartHotelBookingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage() {
        return "guest/login"; // This corresponds to login.html in the templates directory
    }

    @GetMapping("/register")
    public String registerPage() {
        return "guest/register"; // This corresponds to signup.html in the templates directory
    }

    @GetMapping("/host")
    public String hostPage() {
        return "host"; // This corresponds to host.html in the templates directory
    }
    @GetMapping("/")
    public String indexPage() {
        return "index"; // This corresponds to index.html in the templates directory
    }
}