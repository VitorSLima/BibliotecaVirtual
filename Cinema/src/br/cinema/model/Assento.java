package br.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table (name= "tb_assento") 

public class Assento {

	@GeneratedValue
	@Id
	private int id;
	@Column(name = "tipoNE")
	private String tipo; // normal, especial
	private String poltrona;
	
	
//-----------------------------------------------------

	protected Assento() {
	}
	public Assento(String tipo, String poltrona) {
		super();
		this.tipo = tipo;
		this.poltrona = poltrona;
	}	
//-----------------------------------------------------	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
//-----------------------------------------------------		
	public String getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

}