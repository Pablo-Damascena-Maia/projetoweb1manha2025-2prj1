package com.senac.games.controller;

import com.senac.games.entity.Patrocinador;
import com.senac.games.service.PatrocinadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/patrocinador")

public class PatrocinadorController {

    private PatrocinadorService patrocinadorService;

    public PatrocinadorController(PatrocinadorService patrocinadorService) {
        this.patrocinadorService = patrocinadorService;
    }

    @GetMapping("/listar")

    public ResponseEntity<List<Patrocinador>>listarPatrocinadores(){

        return ResponseEntity.ok(patrocinadorService.listarPatrocinadores());
    }
}
