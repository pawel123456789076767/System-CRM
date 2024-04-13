package com.example.demo.service;

import com.example.demo.model.Notatka;
import com.example.demo.model.Zadania;
import com.example.demo.repository.NotatkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class NotatkaService {
    private  NotatkaRepository notatkaRepository;

    @Autowired
    public NotatkaService(NotatkaRepository notatkaRepository) {
        this.notatkaRepository = notatkaRepository;
    }

    public List<Notatka> wszystkieNotatki() {
        return notatkaRepository.findAll();
    }

    public Notatka zapiszNotatkee(String tresc, String dataUtworzenia,String nazwaKontrahenta ) {
        Notatka nowanotatka = new Notatka(dataUtworzenia,tresc,nazwaKontrahenta);
        return notatkaRepository.save(nowanotatka);
    }
}
