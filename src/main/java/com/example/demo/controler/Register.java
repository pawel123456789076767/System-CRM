package com.example.demo.controler;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class Register {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("")
    public String register(@ModelAttribute User user) {
        userService.registerUser(user.getUsername(), user.getPassword(), user.getNazwisko(), user.getEmail(), user.getTelefon());

        return "/home";
    }
}