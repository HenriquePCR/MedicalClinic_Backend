package com.api.clinicamedica.models;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class MedicoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo", nullable = false)
	private FuncionarioModel pessoa;
	
	@Column(name = "especialidade", nullable = true, length = 50)
	private String especialidade;
	
	@Column(name = "crm", nullable = true, length = 50)
	private String crm;
	
	@OneToMany(mappedBy = "codigo_medico")
	private List<AgendaModel> agendas;
	
	
	public FuncionarioModel getPessoa() {
		return pessoa;
	}

	public void setPessoa(FuncionarioModel pessoa) {
		this.pessoa = pessoa;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	
	
	
}
