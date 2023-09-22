package com.example.appfebrapo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pessoas.PessoaFisica;
import pessoas.PessoaFisicaRepository;
import pessoas.PessoaFisicaResponseDTO;

import java.util.List;

@RestController
@RequestMapping("/pessoa/pessoaFisica")
public class Controller {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

}
