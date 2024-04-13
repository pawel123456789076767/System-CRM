package com.example.demo.controler;

import com.example.demo.model.Firmy;
import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.service.FirmyService;
import com.example.demo.service.WizytyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class FirmyController {
    private FirmyService firmyService;

    public FirmyController(FirmyService firmyService) {
        this.firmyService = firmyService;
    }
    @GetMapping("/firmy")
    public String showRegistrationForm(Model model) {
        model.addAttribute("firmy", new Firmy());
        return "firmy";
    }

    @PostMapping("/firmy")
    public String zapiszfirme(@ModelAttribute Firmy firmy) {
        firmyService.zapiszfirme(firmy.getNazwafimry(),firmy.getBranza(),firmy.getOsobadecyzyjna(),firmy.getTelefon(),firmy.getEmail(),firmy.getAdres());
        return "home"; // Możesz przekierować gdziekolwiek w zależności od potrzeb
    }

}


