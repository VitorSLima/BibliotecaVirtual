package br.cinema.model;

public class Assento {

	private String tipo;
	private String poltrona;
	
//-----------------------------------------------------

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

}