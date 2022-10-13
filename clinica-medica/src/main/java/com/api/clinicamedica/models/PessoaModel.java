package com.api.clinicamedica.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

@Entity
@SequenceGenerator(name = "CRD_ID", sequenceName = "RTDS_ADSINPUT_SEQ" ,initialValue = 1, allocationSize = 1)
@Table(name = "Pessoa")
public class PessoaModel {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CRD_ID")
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "email", nullable = true, length = 250)
	private String email;
	
	@Column(name = "telefone", length = 14, nullable = true)
	private String telefone;
	
	@Column(name = "cep", length = 8, nullable = true)
	private String cep;
	
	@Column(name = "logradouro", length = 50, nullable = true)
	private String logradouro;

	@Column(name = "bairro", length = 50, nullable = true)
	private String bairro;

	@Column(name = "cidade", length = 50, nullable = true)
	private String cidade;

	@Column(name = "estado", length = 50, nullable = true)
	private String estado;
	
	@OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY)
	private FuncionarioModel funcionario;
	
	@OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY)
	private PacienteModel paciente;
	
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
