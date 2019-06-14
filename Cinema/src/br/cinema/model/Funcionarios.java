package br.cinema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionarios")


public class Funcionarios extends Pessoa {
	
	private int id;
	private double salario;
	private String funcao;
	private Date dt_Admissao;
	private String turno;

	protected Funcionarios() {
	}

	public Funcionarios(String nome, String cpf, String fone, String endereco, Date dtNascimento, String email) {
		super(nome, cpf, fone, endereco, dtNascimento, email);

	}

	public Funcionarios(String nome, String cpf, String fone, String endereco, Date dtNascimento, String email,
			double salario, String funcao, Date dt_Admissao, String turno) {
		super(nome, cpf, fone, endereco, dtNascimento, email);
		this.salario = salario;
		this.funcao = funcao;
		this.dt_Admissao = dt_Admissao;
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

//-----------------------------------------------------	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
//-----------------------------------------------------	
	public Date getDt_Admissao() {
		return dt_Admissao;
	}

	public void setDt_Admissao(Date dt_Admissao) {
		this.dt_Admissao = dt_Admissao;
	}
//-----------------------------------------------------	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
//-------------------------------------------------------


}
