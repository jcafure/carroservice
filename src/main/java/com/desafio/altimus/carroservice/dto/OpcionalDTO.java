package com.desafio.altimus.carroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OpcionalDTO implements Serializable {
    private Integer id;
    private String nome;

}
