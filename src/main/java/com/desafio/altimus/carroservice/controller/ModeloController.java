package com.desafio.altimus.carroservice.controller;

import com.desafio.altimus.carroservice.dto.ModeloDTO;
import com.desafio.altimus.carroservice.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    private final ModeloService modeloService;

    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @PostMapping(value = "/salvar")
    public ResponseEntity<?> save(@RequestBody ModeloDTO modeloDTO) {
        return ResponseEntity.ok(this.modeloService.save(modeloDTO));
    }

    @PutMapping(value = "/atualizar")
    public ResponseEntity<?> update( @RequestBody ModeloDTO modeloDTO) {
        return ResponseEntity.ok(this.modeloService.update(modeloDTO));
    }

}
