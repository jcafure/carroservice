package com.desafio.altimus.carroservice.model;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private int codigo;
    private String nome;
    private float nota;
public static final  void m1() {

}

    @Override
    public int compareTo(Aluno aluno) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigo == aluno.codigo &&
                Float.compare(aluno.nota, nota) == 0 &&
                Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, nota);
    }
}
