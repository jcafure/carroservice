package com.desafio.altimus.carroservice.service.serviceimp;

import com.desafio.altimus.carroservice.dto.ModeloDTO;
import com.desafio.altimus.carroservice.exception.ObjectNotFoundException;
import com.desafio.altimus.carroservice.model.Modelo;
import com.desafio.altimus.carroservice.repository.ModeloRepository;
import com.desafio.altimus.carroservice.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImp implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Autowired
    public ModeloServiceImp(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public Optional<Modelo> save(ModeloDTO modeloDTO) {
        return Optional.of(modeloRepository.save(buildFromDTO(modeloDTO)));
    }

    @Override
    public Optional<Modelo> update(ModeloDTO modeloDTO) {
        Optional<Modelo> modeloOptional = findById(modeloDTO.getId());
        modeloOptional.get().setAno(modeloDTO.getAno());
        modeloOptional.get().setNomeModelo(modeloDTO.getNomeModelo());
        return Optional.ofNullable(modeloRepository.save(modeloOptional.get()));
    }

    @Override
    public Modelo buildFromDTO(ModeloDTO modeloDTO) {

        return Modelo.builder()
                .nomeModelo(modeloDTO.getNomeModelo())
                .ano(modeloDTO.getAno())
                .build();
    }

    @Override
    public Optional<Modelo> save(Modelo modelo) {
        return Optional.empty();
    }

    @Override
    public Optional<Modelo> update(Modelo modelo) {
        return Optional.empty();
    }

    @Override
    public Optional<Modelo> findById(Integer id) {
        Optional<Modelo> produto = modeloRepository.findById(id);
        return Optional.ofNullable(produto.orElseThrow(() ->
                new ObjectNotFoundException("Modelo não encontrado.")));
    }

    @Override
    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Optional<Modelo> modeloOptional = findById(id);
        modeloRepository.delete(modeloOptional.get());

    }
}
