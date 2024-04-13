package com.example.demo.controler;

import com.example.demo.model.Notatka;
import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.service.NotatkaService;
import com.example.demo.service.UserService;
import com.example.demo.service.WizytyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class WizytyController {
    private WizytyService wizytyService;
    private UserService userService;

    public WizytyController(WizytyService wizytyService, UserService userService) {
        this.wizytyService = wizytyService;
        this.userService = userService;
    }

    @GetMapping("/wizyty")
    public String showRegistrationForm(Model model) {
        model.addAttribute("wizyty", new Wizyty());
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);
        return "wizyty";
    }

    @PostMapping("/wizyty")
    public String zapiszNotatke(@ModelAttribute Wizyty wizyty) {
        wizytyService.zapiszwizyte(wizyty.getData(),wizyty.getGodzina(),wizyty.getCelspotkania(),wizyty.getNotatka(),wizyty.getUser());
        return "home"; // Możesz przekierować gdziekolwiek w zależności od potrzeb
    }
}


