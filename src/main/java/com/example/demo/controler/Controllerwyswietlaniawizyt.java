package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.model.Zadania;
import com.example.demo.service.UserService;
import com.example.demo.service.WizytyService;
import com.example.demo.service.ZadaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/wizytyp")
public class Controllerwyswietlaniawizyt {
    private  UserService userService;
  private WizytyService wizytyService;

    @Autowired
    public Controllerwyswietlaniawizyt(UserService userService, WizytyService wizytyService) {
        this.userService = userService;
        this.wizytyService = wizytyService;
    }

    @GetMapping("/all")
    public String getAllData(Model model) {
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);

        List<Wizyty> wizyty = wizytyService.wszystkiewizyty();
        model.addAttribute("wizyty", wizyty);

        return "wizytyp";
    }
}
