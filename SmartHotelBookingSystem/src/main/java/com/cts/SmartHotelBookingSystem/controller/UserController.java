package com.cts.SmartHotelBookingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class UserController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/booking")
    public String booking() {
        return "booking"; // Maps to src/main/resources/templates/booking.html
    }

}
