package com.example.demo.service;
import com.example.demo.model.Firmy;
import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.repository.ZadanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZadaniaService {
    @Autowired
    private ZadanieRepository zadanieRepository;


    public Zadania registerzadanie(String opisZadania, String produkt, int kwotaumowy, String typumowy, String xddd, User user, String firmy, Firmy firmyy) {
        Zadania nowezadanie = new Zadania(opisZadania,produkt,kwotaumowy,typumowy,xddd,user,firmy);
        return zadanieRepository.save(nowezadanie);
    }

    @Autowired
    public ZadaniaService(ZadanieRepository zadanieRepository) {
        this.zadanieRepository = zadanieRepository;
    }

    public List<Zadania> getAllDataa() {
        return zadanieRepository.findAll();

}


    public void registerzadanie(Zadania zadaniaa) {
        // Logika rejestracji zadania, np. zapis do bazy danych
        zadanieRepository.save(zadaniaa);
    }


}



