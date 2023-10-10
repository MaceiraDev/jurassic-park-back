package com.example.jurassicparkbackend.controller;

import com.example.jurassicparkbackend.dino.Dino;
import com.example.jurassicparkbackend.dino.DinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Dino")

public class DinoController {

    @Autowired
    private DinoRepository repository;
    @GetMapping
    public List getAll(){
        List<Dino> dinoList = repository.findAll();
        return dinoList;
    }

}
