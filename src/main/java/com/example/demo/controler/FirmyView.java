package com.example.demo.controler;

import com.example.demo.model.Firmy;
import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.service.FirmyService;
import com.example.demo.service.UserService;
import com.example.demo.service.WizytyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/firmyp")
public class FirmyView {
    private UserService userService;
    private FirmyService firmyService;

    public FirmyView(UserService userService, FirmyService firmyService) {
        this.userService = userService;
        this.firmyService = firmyService;
    }

    @GetMapping("/all")
    public String getAllData(Model model) {

        List<Firmy> firmy = firmyService.wszystkiefirmy();
        model.addAttribute("firmy", firmy);

        return "firmyp";
    }
}


