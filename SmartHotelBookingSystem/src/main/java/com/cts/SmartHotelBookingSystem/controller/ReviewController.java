package com.cts.SmartHotelBookingSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import com.cts.SmartHotelBookingSystem.model.Review; // Adjust the package path if necessary

@Controller
public class ReviewController {

    @GetMapping("/reviews")
    public String reviewsPage(Model model) {
        // Pass an empty list for now (replace with real data later)
        List<Review> reviews = new ArrayList<>();
        model.addAttribute("reviews", reviews);
        return "reviews"; // This maps to reviews.html in the templates folder
    }
}