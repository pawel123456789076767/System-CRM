package com.example.demo.service;

import com.example.demo.model.Firmy;
import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import com.example.demo.repository.FirmyRepository;
import com.example.demo.repository.WizytyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmyService {
    private FirmyRepository firmyRepository;

    public FirmyService(FirmyRepository firmyRepository) {
        this.firmyRepository = firmyRepository;
    }

    public List<Firmy> wszystkiefirmy() {
        return firmyRepository.findAll();
    }

    public Firmy zapiszfirme(String nazwafimry, String branza, String osobadecyzyjna, String telefon,String email,String adres) {
        Firmy nowawfirma = new Firmy(nazwafimry,branza,osobadecyzyjna,telefon,email,adres);
        return firmyRepository.save(nowawfirma);
    }
}

