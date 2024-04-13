package com.example.demo.service;

import com.example.demo.model.Notatka;
import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.repository.WizytyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WizytyService {
    private WizytyRepository wizytyRepository;

    public WizytyService(WizytyRepository wizytyRepository) {
        this.wizytyRepository = wizytyRepository;
    }

    public List<Wizyty> wszystkiewizyty() {
        return wizytyRepository.findAll();
    }

    public Wizyty zapiszwizyte(String data, String godzina, String celspotkania, String notatka, User user) {
        Wizyty nowawizyta = new Wizyty(data,godzina,celspotkania,notatka,user);
        return wizytyRepository.save(nowawizyta);
    }
}



