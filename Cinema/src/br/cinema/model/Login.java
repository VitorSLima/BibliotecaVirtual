package br.cinema.model;

public class Login {
	private int id; 
	private String usuario;
	private String senha;

//-----------------------------------------------------
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
//-----------------------------------------------------	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
//-----------------------------------------------------
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

}
