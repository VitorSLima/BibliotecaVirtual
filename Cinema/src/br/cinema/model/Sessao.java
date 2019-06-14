package br.cinema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sessao")

public class Sessao {
	@GeneratedValue
	@Id
	private int id;
	private Date data;
	private double hora;
	private int valor;
	private String tipo;

//-----------------------------------------------------

	protected Sessao() {
	}

	public Sessao(Date data, double hora, int valor, String tipo) {
		super();
		this.data = data;
		this.hora = hora;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

//-----------------------------------------------------	
	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

//-----------------------------------------------------	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

//-----------------------------------------------------	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//------------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

}
