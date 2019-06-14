package br.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filme")

public class Filme {
	@GeneratedValue
	@Id
	private int id;
	private String titulo;
	private Double duracao;
	private String classificacao;
	private String genero; 
	private String resumo;
	
//-----------------------------------------------------
	
protected Filme() {
	}
public Filme(String titulo, Double duracao, String classificacao, String genero, String resumo) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.classificacao = classificacao;
		this.genero = genero;
		this.resumo = resumo;
	}
//-----------------------------------------------------	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
//-----------------------------------------------------
	public Double getDuracao() {
		return duracao;
	}
	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}
//-----------------------------------------------------
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
//-----------------------------------------------------
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
//-----------------------------------------------------
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
//-----------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}


}
