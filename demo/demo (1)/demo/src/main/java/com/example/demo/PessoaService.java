package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void inserirCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
