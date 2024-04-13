package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.Wizyty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizytyRepository extends JpaRepository<Wizyty, Long> {

}


