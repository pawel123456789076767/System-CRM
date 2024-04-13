package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Startcontroller {
    @RequestMapping("/")
    public String startPage() {
        return "start"; // To powinno odpowiadać nazwie pliku HTML w folderze resources/templates (np. resources/templates/start.html)
    }
}

