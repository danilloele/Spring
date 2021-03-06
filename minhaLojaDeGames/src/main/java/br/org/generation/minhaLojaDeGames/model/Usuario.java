package br.org.generation.minhaLojaDeGames.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name= "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "A inserção do nome é obrigatória.")
	private String nome;

	@NotNull(message = "A inserção do usuário é obrigatória.")
	@Email(message = "O atributo Usuário deve ser um email válido!")
	private String usuario;

	@NotBlank(message = "A inserção da senha é obrigatória.")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@Column(name= "data_nascimento")
	@JsonFormat(pattern= "yyyy-MM-dd")
	@NotNull(message= "A inserção da data de nascimento é obrigatória.")
	private LocalDate dataNascimento;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
