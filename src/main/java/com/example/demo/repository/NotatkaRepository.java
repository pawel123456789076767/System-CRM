package com.example.demo.repository;

import com.example.demo.model.Notatka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotatkaRepository extends JpaRepository<Notatka, Long> {
    // Dodatkowe metody zapytań, jeśli potrzebujesz
}