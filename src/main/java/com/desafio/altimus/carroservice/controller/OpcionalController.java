package com.desafio.altimus.carroservice.controller;


import com.desafio.altimus.carroservice.dto.ModeloDTO;
import com.desafio.altimus.carroservice.dto.OpcionalDTO;
import com.desafio.altimus.carroservice.service.OpcionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/opcionais")
public class OpcionalController {

    private final OpcionalService opcionalService;

    @Autowired
    public OpcionalController(OpcionalService opcionalService) {
        this.opcionalService = opcionalService;
    }

    @PostMapping(value = "/salvar")
    public ResponseEntity<?> save(@RequestBody OpcionalDTO opcionalDTO) {
        return ResponseEntity.ok(this.opcionalService.save(opcionalDTO));
    }


}
