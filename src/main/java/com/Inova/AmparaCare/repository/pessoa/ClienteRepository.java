package com.Inova.AmparaCare.repository.pessoa;

import com.Inova.AmparaCare.entity.pessoa.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
