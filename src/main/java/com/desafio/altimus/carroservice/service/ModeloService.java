package com.desafio.altimus.carroservice.service;

import com.desafio.altimus.carroservice.dto.ModeloDTO;
import com.desafio.altimus.carroservice.model.Modelo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ModeloService extends BaseService<Modelo> {

    Optional<Modelo> save(ModeloDTO modeloDTO);
    Optional<Modelo> update(ModeloDTO modeloDTO);
    Modelo buildFromDTO(ModeloDTO modeloDTO);

}
