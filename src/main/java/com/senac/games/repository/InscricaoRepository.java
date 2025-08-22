package com.senac.games.repository;

import com.senac.games.entity.Categoria;
import com.senac.games.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao,Integer> {
}
