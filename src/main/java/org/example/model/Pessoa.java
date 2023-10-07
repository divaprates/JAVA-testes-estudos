package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDateTime dtNascimento;

    public Pessoa(String nome, LocalDateTime dtNascimento) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public Integer getIdade() {
        LocalDate dtAtual = LocalDate.now();
        Period periodo = Period.between(dtNascimento.toLocalDate(), dtAtual);
        int anos = periodo.getYears();

        return anos;
    }

    public boolean eMaiorIdade() {
        return getIdade() >= 18;
    }
}
