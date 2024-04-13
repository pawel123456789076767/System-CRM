package com.example.demo.controler;

import org.springframework.web.bind.annotation.RequestMapping;

public class Pzrectawiciel {
    @RequestMapping("/")
    public String sss() {
        return "homeprzectawiciel"; // To powinno odpowiadać nazwie pliku HTML w folderze resources/templates (np. resources/templates/start.html)
    }
}


