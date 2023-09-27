package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    private final PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    private PessoaRepository repository;

    PessoaController(PessoaService pessoaService, PessoaRepository pessoaRepository) {
        this.pessoaService = pessoaService;
        this.repository = pessoaRepository;
    }

    @PostMapping("/inserir")
    public ResponseEntity<String> inserirPessoa(@RequestBody Pessoa pessoa) {
        try {
            pessoaService.inserirPessoa(pessoa);
            return ResponseEntity.ok("Pessoa inserida com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao inserir pessoa: " + e.getMessage());
        }
    }

    }
