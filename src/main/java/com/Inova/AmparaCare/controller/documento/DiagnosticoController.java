package com.Inova.AmparaCare.controller.documento;

import com.Inova.AmparaCare.entity.documento.Diagnostico;
import com.Inova.AmparaCare.repository.documento.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("diagnostico")
public class DiagnosticoController {

    @Autowired
    private DiagnosticoRepository repo;

    @GetMapping
    public List<Diagnostico> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Diagnostico findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Diagnostico save(@RequestBody Diagnostico diagnostico) {
        return repo.save(diagnostico);
    }
}