package com.api.clinicamedica.models;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class FuncionarioModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo", nullable = false)
	private PessoaModel pessoa;
	
	@Column(name = "data_contrato", nullable = true, length = 50)
	private LocalDate data_contrato;
	
	@Column(name = "salario", nullable = true, length = 50)
	private String salario;
	
	@Column(name = "senha_hash", length = 14, nullable = true)
	private String senha;

	public PessoaModel getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}

	public LocalDate getData_contrato() {
		return data_contrato;
	}

	public void setData_contrato(LocalDate data_contrato) {
		this.data_contrato = data_contrato;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
