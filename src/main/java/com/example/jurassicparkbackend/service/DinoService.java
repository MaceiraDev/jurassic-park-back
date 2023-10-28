package com.example.jurassicparkbackend.service;

import com.example.jurassicparkbackend.model.Dino;
import com.example.jurassicparkbackend.repository.DinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DinoService {

    @Autowired
    private DinoRepository dinoRepository;

    public List<Dino> listarTodos() {
        return dinoRepository.findAll();
    }

    public Dino salvar(Dino dino) {
        return dinoRepository.save(dino);
    }


}
