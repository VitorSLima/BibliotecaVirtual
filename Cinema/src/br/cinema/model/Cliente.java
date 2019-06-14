package br.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	private int id;
	@Column(name = "tipoClienteNVPO")
	private String tipoCliente; // Normal; VIP; Platinum; Ouro
	private boolean estudante;
	private LocalDate validade;

	// -----------------------------------------------------------------------
	public String getTipoCliente() {
		return tipoCliente;
	}

	// -----------------------------------------------------------------------
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	// -----------------------------------------------------------------------
	public boolean isEstudante() {
		return estudante;
	}

	// -----------------------------------------------------------------------
	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}

	// -----------------------------------------------------------------------
	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	//-------------------------------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId() {
		this.id = id;
	}

}
