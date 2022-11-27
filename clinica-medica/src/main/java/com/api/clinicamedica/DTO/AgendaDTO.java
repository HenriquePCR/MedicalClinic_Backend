package com.api.clinicamedica.DTO;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AgendaDTO {
	
	
		@NotNull
	    private LocalDate data;
	    @NotBlank
	    private String horario;
	    @NotBlank
	    private String nome;
	    @NotBlank
	    private String email;
	    @NotBlank
		private String telefone;
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
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
	    
	   
	   
}
