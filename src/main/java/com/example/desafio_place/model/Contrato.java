package com.example.desafio_place.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomedevedor;
    private Date dataNascimentoDevedor;
    private String numeoRegistroEletronico;

    private String descricao;  // Adicionando o atributo descricao
    private Double valor;      // Adicionando o atributo valor

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veiculo> veiculos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNomedevedor() {
        return nomedevedor;
    }

    public void setNomedevedor(String nomedevedor) {
        this.nomedevedor = nomedevedor;
    }

    public Date getDataNascimentoDevedor() {
        return dataNascimentoDevedor;
    }

    public void setDataNascimentoDevedor(Date dataNascimentoDevedor) {
        this.dataNascimentoDevedor = dataNascimentoDevedor;
    }

    public String getNumeoRegistroEletronico() {
        return numeoRegistroEletronico;
    }

    public void setNumeoRegistroEletronico(String numeoRegistroEletronico) {
        this.numeoRegistroEletronico = numeoRegistroEletronico;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
