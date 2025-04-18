package com.cts.SmartHotelBookingSystem.controller;

import com.cts.SmartHotelBookingSystem.model.Review;
import com.cts.SmartHotelBookingSystem.service.ReviewService;
import com.cts.SmartHotelBookingSystem.service.HotelService;
import com.cts.SmartHotelBookingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;

=======
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

>>>>>>> 10862fa668bea1b802fb8da5cea5667dca5c15ca
@Controller
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

<<<<<<< HEAD
    @GetMapping("/reviews")
    public String reviewsPage() {
        return "review/reviews"; // This corresponds to reviews.html in the templates/review directory
=======
    @Autowired
    private HotelService hotelService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllReviews(Model model) {
        List<Review> reviews = reviewService.getAllReviews();
        model.addAttribute("reviews", reviews);
        return "reviews"; // Maps to reviews.html
    }

    @GetMapping("/create")
    public String createReviewForm(Model model) {
        model.addAttribute("hotels", hotelService.getAllHotels());
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("review", new Review());
        return "create-review"; // Maps to create-review.html
    }

    @PostMapping("/create")
    public String createReview(@ModelAttribute Review review) {
        reviewService.saveReview(review);
        return "redirect:/reviews";
    }

    @GetMapping("/delete/{id}")
    public String deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
        return "redirect:/reviews";
>>>>>>> 10862fa668bea1b802fb8da5cea5667dca5c15ca
    }
}