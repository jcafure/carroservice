package com.desafio.altimus.carroservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Opcional extends BaseEntity {

    private String nome;

    @ManyToMany(mappedBy = "opcionais")
    @JsonIgnore
    List<Veiculo> veiculos = new ArrayList<>();


}
