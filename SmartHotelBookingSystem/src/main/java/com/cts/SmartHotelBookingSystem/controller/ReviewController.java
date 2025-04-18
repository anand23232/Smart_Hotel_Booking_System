package com.cts.SmartHotelBookingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController {

    @GetMapping("/reviews")
    public String reviewsPage() {
        return "review/reviews"; // This corresponds to reviews.html in the templates/review directory
    }
}