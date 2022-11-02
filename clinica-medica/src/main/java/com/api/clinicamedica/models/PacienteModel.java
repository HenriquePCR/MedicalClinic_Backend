package com.api.clinicamedica.models;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "paciente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PacienteModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo", nullable = false)
	private PessoaModel pessoa;
	
	@Column(name = "peso", nullable = true, length = 50)
	private String peso;
	
	@Column(name = "altura", nullable = true, length = 50)
	private String altura;
	
	@Column(name = "tipo_sanguineo", length = 14, nullable = true)
	private String tipoSanguineo;

	public PessoaModel getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	
	
	
}
