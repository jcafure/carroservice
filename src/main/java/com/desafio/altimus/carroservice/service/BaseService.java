package com.desafio.altimus.carroservice.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BaseService <T> {

    Optional<T> save(T t);
    Optional<T> update(T t);
    Optional<T> findById(Integer id);
    List<T> findAll();
    void delete(Integer id);
}
