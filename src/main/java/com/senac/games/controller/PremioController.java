package com.senac.games.controller;

import com.senac.games.entity.Premio;
import com.senac.games.service.PremioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/premio")
@Tag(name="Premio", description = "API para gerenciamento de premio")
public class PremioController {
    private PremioService premioService;

    public PremioController(PremioService premioService) {
        this.premioService = premioService;
    }
    @GetMapping("/listar")
    @Operation(summary = "Listar premio",description = "Endpont para listar todos os premio")
    public ResponseEntity<List<Premio>>listarPremio(){
        return ResponseEntity.ok(premioService.listarPremio());
    }
}
