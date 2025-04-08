package com.Inova.AmparaCare.repository.servico;

import com.Inova.AmparaCare.entity.servico.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergenciaRepository extends JpaRepository<Emergencia,Long> {
}
