package br.paduan.controle.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=100, nullable=false)
	private String nome;
	
	@Column(name="email", length=100, nullable=false, unique=true)
	private String email;
	
	@Column(name="cpf", length=11, nullable=false, unique=true)
	private String cpf;
	
	@Column(name="senha", length=30, nullable=false)
	private String senha;
	
	@Column(name="linkfoto", length=200)
	private String linkFoto;

	@Column(name="perfil")
	private int perfil;

	//Cria relacionamento usuario <> chamado
	@OneToMany(mappedBy = "usuario")
	@JsonIgnoreProperties("usuario") //ignora a propriedade usuario para nao ficar buscando infiinitamente
	private List<Chamado> chamados;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

}
