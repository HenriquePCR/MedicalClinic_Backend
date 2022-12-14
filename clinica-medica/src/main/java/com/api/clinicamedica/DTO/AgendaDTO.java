package com.api.clinicamedica.DTO;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AgendaDTO {
	
		private Long codigo;
	    private LocalDate data;
	    private String horario;
	    private String nome;

	    
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
		public Long getCodigo() {
			return codigo;
		}
		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

}
