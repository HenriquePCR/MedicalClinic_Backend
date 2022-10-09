package com.api.clinicamedica.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BaseDeEnderecosDTO {
	
	    @NotBlank
	    @Size(max = 8)
	    private String CEP;
	    @NotBlank
	    private String Logradouro;
	    @NotBlank
	    private String Bairro;
	    @NotBlank
	    private String Cidade;
	    @NotBlank
	    private String Estado;
	    
	    
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
