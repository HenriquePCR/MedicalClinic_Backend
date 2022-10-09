package com.api.clinicamedica.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BaseDeEnderecos")
public class BaseDeEnderecosModel {
	
	private static final long serialVersionUID = 1L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id_baseEndereco;
	    @Column( nullable = false,unique = true, length = 8)
	    private String CEP;
	    @Column( nullable = false,length = 70)
	    private String Logradouro;
	    @Column( nullable = false,length = 70)
	    private String Bairro;
		@Column( nullable = false,length = 70)
	    private String Cidade;
	    @Column( nullable = false,length = 70)
	    private String Estado;
	    
	    public UUID getId_baseEndereco() {
			return id_baseEndereco;
		}
		public void setId_baseEndereco(UUID id_baseEndereco) {
			this.id_baseEndereco = id_baseEndereco;
		}
		public String getCEP() {
			return CEP;
		}
		public void setCEP(String cEP) {
			CEP = cEP;
		}
		public String getLogradouro() {
			return Logradouro;
		}
		public void setLogradouro(String logradouro) {
			Logradouro = logradouro;
		}
		public String getBairro() {
			return Bairro;
		}
		public void setBairro(String bairro) {
			Bairro = bairro;
		}
		public String getCidade() {
			return Cidade;
		}
		public void setCidade(String cidade) {
			Cidade = cidade;
		}
		public String getEstado() {
			return Estado;
		}
		public void setEstado(String estado) {
			Estado = estado;
		}

	

}
