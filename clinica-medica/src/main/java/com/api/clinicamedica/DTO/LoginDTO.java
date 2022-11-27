package com.api.clinicamedica.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginDTO {
	
	    @NotBlank
	    private String Email;
	    @NotBlank
	    private String Senha;
	    
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getSenha() {
			return Senha;
		}
		public void setSenha(String senha) {
			Senha = senha;
		}

	    
}
