package com.Inova.AmparaCare.repository.documento;

import com.Inova.AmparaCare.entity.documento.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long> {
}
