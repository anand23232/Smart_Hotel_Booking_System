package com.cts.SmartHotelBookingSystem.controller;

import com.cts.SmartHotelBookingSystem.model.User;
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
@RequestMapping("/users")
public class UserController {
<<<<<<< HEAD

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
=======
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // Maps to users.html
    }

    @GetMapping("/create")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "create-user"; // Maps to create-user.html
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
>>>>>>> 10862fa668bea1b802fb8da5cea5667dca5c15ca
    }
}