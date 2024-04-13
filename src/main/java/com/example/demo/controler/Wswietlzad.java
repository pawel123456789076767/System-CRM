package com.example.demo.controler;


import com.example.demo.model.User;
import com.example.demo.model.Zadania;

import com.example.demo.service.UserService;
import com.example.demo.service.ZadaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/dodanezadania")
public class Wswietlzad {
    private  UserService userService;
    @Autowired
    public Wswietlzad(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String getAllData(Model model) {
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);
        return "dodanezadania"; // Zwraca nazwę pliku HTML (bez rozszerzenia)
    }

}