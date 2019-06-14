package br.cinema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")

public class Pessoa {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String cpf;
	private String fone;
	private String endereco;
	private Date dtNascimento;
	private String email;
	private String senha;

	protected Pessoa() {
	}

	public Pessoa(String nome, String cpf, String fone, String endereco, Date dtNascimento, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
	}

	// --------------------------------------------------------------------
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// --------------------------------------------------------------------
	public String getCpf() {
		// retornar cpf com mask
		Formatar fmt = new FormatarString();
		String maskCpf = "###.###.###-##";
		return fmt.cpf(cpf, maskCpf);
	}

	// --------------------------------------------------------------------
	public void setCpf(String cpf) {
		// validar CPF
		this.cpf = cpf;
	}

	// --------------------------------------------------------------------
	public String getFone() {
		// retornar fone com mask
		return fone;
	}

	// --------------------------------------------------------------------
	public void setFone(String fone) {
		this.fone = fone;
	}

	// --------------------------------------------------------------------
	public String getEndereco() {
		return endereco;
	}

	// --------------------------------------------------------------------
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// --------------------------------------------------------------------
	public Date getDtNascimento() {
		return dtNascimento;
	}

	// --------------------------------------------------------------------
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	// --------------------------------------------------------------------
	public String getEmail() {
		return email;
	}

	// --------------------------------------------------------------------
	public void setEmail(String email) {
		// validar email aqui
		this.email = email;
	}

	// ---------------------------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

}
