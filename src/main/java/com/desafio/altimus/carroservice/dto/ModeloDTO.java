package com.desafio.altimus.carroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModeloDTO implements Serializable {

    private Integer id;
    private String nomeModelo;
    private String ano;
}
