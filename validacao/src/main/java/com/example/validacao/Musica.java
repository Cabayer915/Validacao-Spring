package com.example.validacao;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class Musica {
    @NotBlank
    private String nome;
    @Size(min = 1, max = 32)
    private String album;
    // @Past
    // @Future
    // @FutureOrPresent
    @PastOrPresent
    private LocalDate dataLancamento;
    @DecimalMin("1.0")
    @DecimalMax("5.0")
    private Double nota;
    @Min(1)
    @Max(100)
    private Integer ranking;

    // @Email
    // @CNPJ
    // @CPF
    // private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Musica() {
    }
}
