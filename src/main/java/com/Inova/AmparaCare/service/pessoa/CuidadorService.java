package com.Inova.AmparaCare.service.pessoa;

import com.Inova.AmparaCare.entity.pessoa.Cuidador;

import java.util.List;

public interface CuidadorService {

    Cuidador save(Cuidador c);

    void delete(Cuidador c);

    void deleteById(long id);

    List<Cuidador> findAllCuidador();
}
