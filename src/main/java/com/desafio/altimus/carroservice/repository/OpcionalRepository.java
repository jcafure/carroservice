package com.desafio.altimus.carroservice.repository;

import com.desafio.altimus.carroservice.model.Opcional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionalRepository extends JpaRepository<Opcional, Integer> {
}
