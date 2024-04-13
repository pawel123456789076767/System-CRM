package com.example.demo.controler;

import com.example.demo.model.Notatka;
import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.service.NotatkaService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller

public class NotatkaController {
    private  NotatkaService notatkaService;
    private  UserService userService;

    public NotatkaController(NotatkaService notatkaService, UserService userService) {
        this.notatkaService = notatkaService;
        this.userService = userService;
    }

    @GetMapping("/notatki")
    public String showRegistrationForm(Model model) {
        model.addAttribute("notatki", new Notatka());
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);
        return "notatki";
    }

    @PostMapping("/notatki")
    public String zapiszNotatke(@ModelAttribute Notatka notatka) {
        notatkaService.zapiszNotatkee(notatka.getDataUtworzenia(),notatka.getTresc(),notatka.getNazwaKontrahenta());
        return "redirect:/"; // Możesz przekierować gdziekolwiek w zależności od potrzeb
    }
}

