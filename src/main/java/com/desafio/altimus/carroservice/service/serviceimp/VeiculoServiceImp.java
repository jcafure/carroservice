package com.desafio.altimus.carroservice.service.serviceimp;

import com.desafio.altimus.carroservice.exception.ObjectNotFoundException;
import com.desafio.altimus.carroservice.model.Veiculo;
import com.desafio.altimus.carroservice.repository.VeiculoRepository;
import com.desafio.altimus.carroservice.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoServiceImp implements VeiculoService {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoServiceImp(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public Optional<Veiculo> save(Veiculo veiculo) {
        veiculo = buildVeiculo(veiculo);
        return Optional.ofNullable(veiculoRepository.save(veiculo));
    }

    private Veiculo buildVeiculo(Veiculo veiculo) {
        veiculo.setModelo(veiculo.getModelo());
        veiculo.setOpcionais(veiculo.getOpcionais());
        veiculo.setValor(veiculo.getValor());
        veiculo.setPlaca(veiculo.getPlaca());
        veiculo.setRenavam(veiculo.getRenavam());
        veiculo.setDataDeCadastro(veiculo.getDataDeCadastro());
        return veiculo;
    }

    @Override
    public Optional<Veiculo> update(Veiculo veiculo) {
        Optional<Veiculo> veiculoOptional = findById(veiculo.getId());
        veiculoOptional.get().setDataDeCadastro(veiculo.getDataDeCadastro());
        veiculoOptional.get().setModelo(veiculo.getModelo());
        veiculoOptional.get().setPlaca(veiculo.getPlaca());
        veiculoOptional.get().setRenavam(veiculo.getRenavam());
        veiculoOptional.get().setValor(veiculo.getValor());
        veiculoOptional.get().setOpcionais(veiculo.getOpcionais());
        return Optional.ofNullable(veiculoRepository.save(veiculoOptional.get()));

    }

    @Override
    public Optional<Veiculo> findById(Integer id) {
        Optional<Veiculo> produto = veiculoRepository.findById(id);
        return Optional.ofNullable(produto.orElseThrow(() ->
                new ObjectNotFoundException("Veiculo não encontrado.")));
    }

    @Override
    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Optional<Veiculo> veiculoOptional = veiculoRepository.findById(id);
        veiculoRepository.delete(veiculoOptional.get());

    }
}
