package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.service.ZadaniaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Optional<User> findById(Long id);

}
