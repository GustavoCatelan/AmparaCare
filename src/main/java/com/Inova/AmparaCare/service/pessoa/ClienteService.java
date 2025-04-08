package com.Inova.AmparaCare.service.pessoa;

import com.Inova.AmparaCare.entity.pessoa.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente c);

    void delete(Cliente c);

    void deleteById(long id);

    List<Cliente> findAllCliente();
}
