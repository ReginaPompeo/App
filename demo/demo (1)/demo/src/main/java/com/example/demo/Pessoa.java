package com.example.demo;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pessoa")
@Entity(name = "pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
@Data
public class Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Long getValorAcordo() {
        return valorAcordo;
    }

    public void setValorAcordo(Long valorAcordo) {
        this.valorAcordo = valorAcordo;
    }

    private Long cpf;
    private String nome;
    private String email;
    private Long valorAcordo;
}
