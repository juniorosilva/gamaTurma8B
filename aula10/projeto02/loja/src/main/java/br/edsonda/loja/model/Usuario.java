package br.edsonda.loja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario") //nome da tabela no banco de dados
public class Usuario {
    
    @Id //indica que é uma chave primaria - identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração automatica de chave sequencial
    @Column(name="id") //nome da coluna na tabela do BD
    private int id;
    
    @Column(name="nome",length = 100, nullable=false)
    private String nome;
    
    @Column(name="email", length = 100 , nullable = false, unique = true)
    private String email;
    
    @Column(name="senha", length = 20,nullable = false)
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    
}
