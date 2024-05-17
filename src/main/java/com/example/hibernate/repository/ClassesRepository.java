package com.example.hibernate.repository;

import com.example.hibernate.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes, Long> {
}
