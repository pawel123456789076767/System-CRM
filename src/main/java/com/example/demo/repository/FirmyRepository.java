package com.example.demo.repository;

import com.example.demo.model.Firmy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FirmyRepository extends JpaRepository<Firmy,Long> {

}
