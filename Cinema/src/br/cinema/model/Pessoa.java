package br.cinema.model;

import java.util.Date;

public class Pessoa {
	
	private int idClientes;
	private String nome;
	private String cpf;
	private String fone;
	private String endereco;
	private Date dtNascimento;
	private String email;
	
	
	public Pessoa(String nome, String cpf, String fone, String endereco, Date dtNascimento, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
		this.dtNascimento = dtNascimento;
		this.email = email;
	}
	
	
	//--------------------------------------------------------------------
	public String getNome() {
		return nome;
	}
	//--------------------------------------------------------------------
	public void setNome(String nome) {
		this.nome = nome;
	}
	//--------------------------------------------------------------------
	public String getCpf() {
		// retornar cpf com mask
		Formatar fmt = new FormatarString();
		String maskCpf = "###.###.###-##";
		return fmt.cpf(cpf, maskCpf);
	}
	//--------------------------------------------------------------------
	public void setCpf(String cpf) {
		// validar CPF
		this.cpf = cpf;
	}
	//--------------------------------------------------------------------
	public String getFone() {
		// retornar fone com mask
		return fone;
	}
	//--------------------------------------------------------------------
	public void setFone(String fone) {
		this.fone = fone;
	}
	//--------------------------------------------------------------------
	public String getEndereco() {
		return endereco;
	}
	//--------------------------------------------------------------------
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//--------------------------------------------------------------------
	public Date getDtNascimento() {
		return dtNascimento;
	}
	//--------------------------------------------------------------------
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	//--------------------------------------------------------------------
	public String getEmail() {
		return email;
	}
	//--------------------------------------------------------------------
	public void setEmail(String email) {
		// validar email aqui
		this.email = email;
	}
	
	
	
}
