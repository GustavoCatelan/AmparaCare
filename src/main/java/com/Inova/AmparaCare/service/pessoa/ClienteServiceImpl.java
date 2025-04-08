package com.Inova.AmparaCare.service.pessoa;

import com.Inova.AmparaCare.entity.pessoa.Cliente;
import com.Inova.AmparaCare.repository.pessoa.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClienteServiceImpl implements ClienteService{

    private ClienteRepository repo;

    @Override
    @Transactional
    public Cliente save(Cliente c){return repo.save(c);}

    @Override
    @Transactional
    public void delete(final Cliente c){this.repo.delete(c);}

    @Override
    @Transactional
    public void deleteById(final long id){this.repo.deleteById(id);}

    @Transactional
    public Optional<Cliente> findById(final long id){return this.repo.findById(id);}

    @Transactional
    public List<Cliente> findAllCliente(){return this.repo.findAll();}
}
