package com.api.clinicamedica.DTO;


import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class PessoaPacienteDTO {
	
	    private Long codigo;
	    @NotBlank
	    private String peso;
	    @NotBlank
	    private String altura;
	    @NotBlank
	    private String tipoSanguineo;
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
