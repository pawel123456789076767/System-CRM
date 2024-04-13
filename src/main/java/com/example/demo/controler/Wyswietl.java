package com.example.demo.controler;

import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.ZadanieRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.ZadaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/kontrahent")
public class Wyswietl {

    private UserService userService;
    private ZadaniaService zadaniaService;
    private ZadanieRepository zadanieRepository;
    private UserRepository userRepository;

    public Wyswietl(UserService userService, ZadaniaService zadaniaService, ZadanieRepository zadanieRepository, UserRepository userRepository) {
        this.userService = userService;
        this.zadaniaService = zadaniaService;
        this.zadanieRepository = zadanieRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public String getAllData(Model model) {
        List<User> users = userService.getAllData();
        model.addAttribute("users", users);
        List<Zadania> userlist = zadanieRepository.findAll();

        List<Zadania> zadaniaa = zadaniaService.getAllDataa();
        model.addAttribute("zadania", zadaniaa);
        List<Zadania> zadaniaList = zadanieRepository.findAll();

        // Mapa do przechowywania sumy kwotaumowy dla każdej wartości xdd
        Map<String, Integer> xddSumMap = new HashMap<>();

        // Oblicz sumę dla każdej wartości xdd
        for (Zadania zadania : zadaniaa) {
            String xddValue = zadania.getXddd();
            int kwotaumowy = zadania.getKwotaumowy();

            // Zaktualizuj sumę dla bieżącej wartości xdd
            xddSumMap.merge(xddValue, kwotaumowy, Integer::sum);
        }

        // Zaktualizuj pole sumaumow dla każdego zadania z odpowiadającą wartością xdd
        for (Zadania zadania : zadaniaa) {
            String xddValue = zadania.getXddd();
            int sumaumow = xddSumMap.getOrDefault(xddValue, 0);
            zadania.setSumaumowy(sumaumow);
        }
        for (User user : users) {
            Long xddValue = user.getId();
            int sumaumow = xddSumMap.getOrDefault(xddValue, 0);
            user.setSumaumow(sumaumow);
        }

        // Zapisz zmiany do bazy danych
        zadanieRepository.saveAll(zadaniaa);
        userRepository.saveAll(users);

        // Dodaj zadaniaa i całkowitą sumę do modelu
        model.addAttribute("zadania", zadaniaa);
        model.addAttribute("result", xddSumMap);
        model.addAttribute("zadania", users);

        return "kontrahent";
    }}