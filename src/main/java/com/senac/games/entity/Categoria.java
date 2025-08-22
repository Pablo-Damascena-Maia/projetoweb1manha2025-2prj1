package com.senac.games.entity;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name= "categoria")

public class Categoria {
    @Id
    @GeneratedValue
    @Column(name="categoria_id")
    private Integer id;
    @Column(name="categoria_nome")
    private String nome;
    @Column(name="categoria_status")
    private Integer status;
    @OneToMany (mappedBy = "categoria")
    private Set<Jogo> jogo;

    public Set<Jogo> getJogo() {
        return jogo;
    }

    public void setJogo(Set<Jogo> jogo) {
        this.jogo = jogo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
