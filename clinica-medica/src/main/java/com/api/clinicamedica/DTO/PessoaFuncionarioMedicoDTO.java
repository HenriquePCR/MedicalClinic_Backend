package com.api.clinicamedica.DTO;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class PessoaFuncionarioMedicoDTO {

	private Long codigo;

	@NotBlank
	private LocalDate dataContrato;
	@NotBlank
	private String salario;
	@NotBlank
	private String senhaHash;
	@NotBlank
	private String especialidade;
	@NotBlank
	private String crm;
	@NotBlank
	private String nome;
	@NotBlank
	private String email;
	@NotBlank
	private String telefone;
	@NotBlank
	private String cep;
	@NotBlank
	private String logradouro;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;
	
	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getSenhaHash() {
		return senhaHash;
	}

	public void setSenhaHash(String senhaHash) {
		this.senhaHash = senhaHash;
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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
