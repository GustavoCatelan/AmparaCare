package com.Inova.AmparaCare.repository.produto;

import com.Inova.AmparaCare.entity.produto.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo,Long> {
}
