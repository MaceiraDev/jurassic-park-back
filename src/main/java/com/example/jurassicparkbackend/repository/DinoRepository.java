package com.example.jurassicparkbackend.repository;
import com.example.jurassicparkbackend.model.Dino;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DinoRepository extends JpaRepository<Dino, Long> {
}
