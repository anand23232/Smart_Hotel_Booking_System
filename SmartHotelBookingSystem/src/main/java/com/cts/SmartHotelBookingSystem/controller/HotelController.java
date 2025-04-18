package com.cts.SmartHotelBookingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {

    @GetMapping("/add-hotel")
    public String addHotelPage() {
        return "hotel-manager/add-hotel"; // This corresponds to add-hotel.html in the templates directory
    }
}