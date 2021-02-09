package com.desafio.altimus.carroservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Veiculo extends BaseEntity {


    private String placa;

    private String renavam;

    private BigDecimal valor;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDeCadastro;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @ManyToMany
    @JoinTable(
            name = "veiculos_opcionais",
            joinColumns = @JoinColumn(name = "veiculo_id"),
            inverseJoinColumns = @JoinColumn(name = "opcional_id"))
    private List<Opcional> opcionais = new ArrayList<>();


}
