package com.example.demo.controler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontlorel {

    @GetMapping("/")
    public String home() {
        // Ta metoda obsługuje żądania GET na ścieżkę "/"
        // Zwraca nazwę widoku (view name), w tym przypadku "home", który będzie mapowany na plik HTML.
        return "home";
    }
}

