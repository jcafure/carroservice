package com.desafio.altimus.carroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Modelo extends BaseEntity{

    private String nomeModelo;
    private String ano;

}
