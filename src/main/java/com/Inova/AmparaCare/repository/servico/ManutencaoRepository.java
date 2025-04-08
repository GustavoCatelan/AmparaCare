package com.Inova.AmparaCare.repository.servico;

import com.Inova.AmparaCare.entity.servico.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManutencaoRepository extends JpaRepository<Manutencao,Long> {
}