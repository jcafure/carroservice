package com.desafio.altimus.carroservice.service.serviceimp;

import com.desafio.altimus.carroservice.dto.OpcionalDTO;
import com.desafio.altimus.carroservice.model.Opcional;
import com.desafio.altimus.carroservice.repository.OpcionalRepository;
import com.desafio.altimus.carroservice.service.OpcionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpcionalServiceImp implements OpcionalService {

    private final OpcionalRepository opcionalRepository;

    @Autowired
    public OpcionalServiceImp(OpcionalRepository opcionalRepository) {
        this.opcionalRepository = opcionalRepository;
    }

    @Override
    public Optional<Opcional> save(Opcional opcional) {
        return Optional.empty();
    }

    @Override
    public Optional<Opcional> update(Opcional opcional) {
        return Optional.empty();
    }

    @Override
    public Optional<Opcional> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Opcional> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Optional<Opcional> save(OpcionalDTO opcionalDTO) {
        return Optional.ofNullable(opcionalRepository.save(buildFromDTO(opcionalDTO)));
    }

    @Override
    public Opcional buildFromDTO(OpcionalDTO opcionalDTO) {
        return Opcional.builder().nome(opcionalDTO.getNome()).build();
    }
}
