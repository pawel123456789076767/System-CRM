package com.example.demo.controler;


import com.example.demo.model.Firmy;
import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.ZadanieRepository;
import com.example.demo.service.FirmyService;
import com.example.demo.service.UserService;
import com.example.demo.service.ZadaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class Zad {

    private final ZadaniaService zadaniaService;
    private final UserService userService;
    private UserRepository userRepository;
    private ZadanieRepository zadanieRepository;
    private final FirmyService firmyService;


    public Zad(ZadaniaService zadaniaService, UserService userService, UserRepository userRepository, ZadanieRepository zadanieRepository, FirmyService firmyService) {
        this.zadaniaService = zadaniaService;
        this.userService = userService;
        this.userRepository = userRepository;
        this.zadanieRepository = zadanieRepository;
        this.firmyService = firmyService;
    }

    @GetMapping("/dodajzad")
    public String showRegistrationForm(Model model) {
        model.addAttribute("zadania", new Zadania());
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);
        List<Firmy> firmy = firmyService.wszystkiefirmy();
        model.addAttribute("firmy", firmy);

        return "dodajzad";
    }


    @PostMapping("/dodajzad")
    public String addZadanie(@ModelAttribute Zadania zadania) {
        zadaniaService.registerzadanie(zadania.getOpisZadania(),zadania.getProdukt(),zadania.getKwotaumowy(),zadania.getTypumowy(),zadania.getXddd(),zadania.getUser(),zadania.getFirmy(),zadania.getFirmyy());
            return "/home";
        }

    }



