package com.desafio.altimus.carroservice.controller;

import com.desafio.altimus.carroservice.model.Veiculo;
import com.desafio.altimus.carroservice.service.serviceimp.VeiculoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final VeiculoServiceImp veiculoServiceImp;

    @Autowired
    public VeiculoController(VeiculoServiceImp veiculoServiceImp) {
        this.veiculoServiceImp = veiculoServiceImp;
    }

    @PostMapping(value = "/salvar")
    public ResponseEntity<?> save( @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(this.veiculoServiceImp.save(veiculo));
    }

    @PutMapping(value = "/atualizar")
    public ResponseEntity<?> update( @RequestBody Veiculo veiculo) {
        return ResponseEntity.ok(this.veiculoServiceImp.update(veiculo));
    }

    @DeleteMapping(value = "/deletar-veiculo/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        veiculoServiceImp.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/listar-veiculos")
    public ResponseEntity<List<Veiculo>> findAll() {
        List<Veiculo> veiculos = veiculoServiceImp.findAll();
        return new ResponseEntity<>(veiculos, HttpStatus.OK);
    }

}
