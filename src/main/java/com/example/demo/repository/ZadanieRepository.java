package com.example.demo.repository;


import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ZadanieRepository extends JpaRepository<Zadania, Long> {
    List<Zadania> findByUser(User user);
}

