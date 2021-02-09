package com.desafio.altimus.carroservice.service;

import com.desafio.altimus.carroservice.dto.OpcionalDTO;
import com.desafio.altimus.carroservice.model.Opcional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface OpcionalService extends BaseService<Opcional> {
    Optional<Opcional> save(OpcionalDTO opcionalDTO);
    Opcional buildFromDTO(OpcionalDTO opcionalDTO);
}
